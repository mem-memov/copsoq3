package net.mem_memov.copsoq3.dataSource

import net.mem_memov.copsoq3.{DataSource, QuestionEnumeration, Survey}

import scala.annotation.tailrec
import scala.collection.Iterator
import java.io._

case class CsvFile(path: String) extends DataSource:

  override def read[A](
    processRow: (Int, Vector[String]) => A
  ): Vector[A] =

    val bufferedSource = io.Source.fromFile(path)

    @tailrec
    def accumulate(
      lines: Iterator[String],
      rowIndex: Int,
      incompleteRowOption: Option[Vector[String]],
      processRow: (Int, Vector[String]) => A,
      rows: Vector[A]
    ): Vector[A] =

      if lines.hasNext then
        val columns = lines.next().split(";").map(_.trim).toVector
        incompleteRowOption match
          case Some(incompleteRow) =>
            val rest =
            val modifiedLastCell = lines.next()


          case None =>
            if columns.last.startsWith("\"") then
              accumulate(lines, rowIndex, Some(columns), processRow, rows.appended(row))
            else
              val row = processRow(rowIndex, columns)
              accumulate(lines, rowIndex+1, None, processRow, rows.appended(row))
      else
        rows

    val rows = accumulate(
      bufferedSource.getLines,
      0,
      None,
      processRow,
      Vector()
    )

    bufferedSource.close

    rows

  override def readFirst[A](processRow: Vector[String] => A): Option[A] =

    val bufferedSource = io.Source.fromFile(path)
    val lines = bufferedSource.getLines

    val rowOption = if lines.hasNext then
      val row = processRow(columns)
      Some(row)
    else
      None

    bufferedSource.close

    rowOption

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