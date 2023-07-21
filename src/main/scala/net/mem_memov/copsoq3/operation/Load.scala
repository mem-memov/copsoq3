package net.mem_memov.copsoq3.operation

import net.mem_memov.copsoq3.format.Testograf
import net.mem_memov.copsoq3.{Command, DataSource, Operation, Questionnaire, QuestionEnumeration, Survey}

case class Load(
  command: Command.Load.type
) extends Operation:

  override def run(survey: Survey): Survey =

    println("Загрузка файла")

    val path = io.StdIn.readLine("Укажите путь к файлу в формате CSV: ")

    val dataSource = DataSource.csvFile(path)

    val headerRowOption = dataSource.readFirst { row =>

    }

    val questionnaires = dataSource.read { (rowIndex, row) =>
      QuestionEnumeration.getAll.toVector.foldLeft(Questionnaire.empty) { (questionnaire, questionEnumeration) =>
        val question = questionEnumeration.getQuestion
        val columnNumberOption = Testograf.getColumnNumber(questionEnumeration)
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

