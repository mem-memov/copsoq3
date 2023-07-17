package net.mem_memov.copsoq3.operation

import net.mem_memov.copsoq3.format.Testograf
import net.mem_memov.copsoq3.{Command, DataSource, Operation, QuestionEnumeration, Survey}

case class Load(
  command: Command.Load.type
) extends Operation:

  override def run(survey: Survey): Survey =

    val path = io.StdIn.readLine("Укажите путь к файлу в формате CSV: ")

    val dataSource = DataSource.csvFile(path)

    dataSource.load { row =>
      val codeValueOptions = QuestionEnumeration.getAll.toVector.map { questionEnumeration =>
        val question = questionEnumeration.getQuestion
        for {
          columnNumber <- Testograf.getColumnNumber(questionEnumeration)
          if columnNumber < row.length
          input = row(columnNumber - 1)
          value <- question.scale.evaluate(input)
        } yield
          (question.code -> value)
      }
      codeValueOptions.filter(_.nonEmpty).map { v =>
        println(v)
      }
      ()
    }

    survey
