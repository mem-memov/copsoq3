package net.mem_memov.copsoq3.dataSource

import net.mem_memov.copsoq3.{DataSource, QuestionEnumeration, Survey}

import scala.annotation.tailrec
import scala.collection.Iterator
import java.io._

case class CsvFile(path: String) extends DataSource:

  def read[A](
    processRow: Vector[String] => A
  ): Vector[A] =

    val bufferedSource = io.Source.fromFile(path)

    @tailrec
    def accumulate(
      lines: Iterator[String],
      processRow: Vector[String] => A,
      rows: Vector[A]
    ): Vector[A] =

      if lines.hasNext then
        val columns = lines.next().split(";").map(_.trim).toVector
        val row = processRow(columns)
        accumulate(lines, processRow, rows.appended(row))
      else
        rows

    val rows = accumulate(
      bufferedSource.getLines,
      processRow,
      Vector()
    )

    bufferedSource.close

    rows

  override def write(survey: Survey): Unit =

    val file = new File(path)
    val bufferedWriter = new BufferedWriter(new FileWriter(file))

    survey.forFirst { questionnaireOption =>
      for {
        questionnaire <- questionnaireOption
      } yield
        val questionMap = QuestionEnumeration.toCodeQuestionMap
        val dimensionCodes = questionnaire.map { (questionCode, _) =>
          questionMap.get(questionCode) match {
            case Some(question) => question.dimension.code
            case None => ""
          }
        }
        val line = dimensionCodes.mkString(";") + "\n"
        bufferedWriter.write(line)
    }

    survey.forFirst { questionnaireOption =>
      for {
        questionnaire <- questionnaireOption
      } yield
        val questionCodes = questionnaire.map ((questionCode, _) => questionCode)
        val line = questionCodes.mkString(";") + "\n"
        bufferedWriter.write(line)
    }

    survey.foreach { questionnaire =>
      val cells = questionnaire.map { (_, valueOption) =>
        valueOption match
          case None => ""
          case Some(value) => value.toString
      }
      val line = cells.mkString(";") + "\n"
      bufferedWriter.write(line)
    }

    bufferedWriter.close()