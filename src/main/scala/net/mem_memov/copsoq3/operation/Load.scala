package net.mem_memov.copsoq3.operation

import net.mem_memov.copsoq3.{Command, DataSource, Operation, Questionnaire, QuestionEnumeration, Survey}

case class Load(
  command: Command.Load.type
) extends Operation:

  override def run(survey: Survey): Survey =

    println("Загрузка файла")

    val path = io.StdIn.readLine("Укажите путь к файлу в формате CSV: ")

    val dataSource = DataSource.csvFile(path)

    val codeQuestionMap = QuestionEnumeration.toCodeQuestionMap
    val questionColumnMapOption = dataSource.readFirst { row =>
      val codeQuestionOptions = row.map { cell =>
        codeQuestionMap.get(cell) match
          case Some(codeQuestion) =>
            Some(codeQuestion)
          case None =>
            val questionCodes = codeQuestionMap.keys.filter(key => cell.contains("[" + key + "]"))
            if questionCodes.isEmpty then
              None
            else
              codeQuestionMap.get(questionCodes.head)
      }
      codeQuestionOptions.zipWithIndex.filter(_._1.nonEmpty).map(pair => (pair._1.get, pair._2)).toMap
    }

    questionColumnMapOption match
      case None =>
        survey
      case Some(questionColumnMap) =>
        val questionnaires = dataSource.read { (rowIndex, row) =>
          QuestionEnumeration.getAll.toVector.foldLeft(Questionnaire.empty) { (questionnaire, questionEnumeration) =>
            val question = questionEnumeration.getQuestion
            val columnNumberOption = questionColumnMap.get(question)
            columnNumberOption match
              case None =>
                questionnaire.addValueOption(question.code, None)
              case Some(columnNumber) =>
                if columnNumber >= row.length then
                  questionnaire.addValueOption(question.code, None)
                else
                  val input = row(columnNumber - 1)
                  val valueOption = question.scale.evaluate(input)
                  questionnaire.addValueOption(question.code, valueOption)
          }
        }

        questionnaires.foldLeft(survey){ (survey, questionnaire) =>
          survey.addQuestionnaire(questionnaire)
        }

