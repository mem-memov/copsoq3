package net.mem_memov.copsoq3.operation

import net.mem_memov.copsoq3.{Command, DataSource, Operation, Question, Questionnaire, QuestionEnumeration, Survey}

case class Load(
  command: Command.Load.type
) extends Operation:

  override def run(survey: Survey): Survey =

    println("Загрузка файла")

    val path = io.StdIn.readLine("Укажите путь к файлу в формате CSV: ")
    val dataSource = DataSource.csvFile(path)
    val questionColumnMapOption = Load.readQuestionColumnMapOption(dataSource)

    questionColumnMapOption match
      case None =>
        survey
      case Some(questionColumnMap) =>
        val questionnaires = Load.readQuestionnaires(dataSource, questionColumnMap)

        questionnaires.foldLeft(survey){ (survey, questionnaire) =>
          survey.addQuestionnaire(questionnaire)
        }

object Load:

  def readQuestionColumnMapOption(dataSource: DataSource): Option[Map[Question, Int]] =

    val codeQuestionMap = QuestionEnumeration.toCodeQuestionMap
    dataSource.readFirst { row =>
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

  def readQuestionnaires(dataSource: DataSource, questionColumnMap: Map[Question, Int]): Vector[Questionnaire] =

    dataSource.read(readQuestionnaire(questionColumnMap))

  def readQuestionnaire(questionColumnMap: Map[Question, Int])(rowIndex: Int, row: Vector[String]): Questionnaire =

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
