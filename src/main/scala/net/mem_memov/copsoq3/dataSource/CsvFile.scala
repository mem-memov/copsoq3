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

    val rows = accumulate(
      bufferedSource.getLines,
      0,
      None,
      (rowIndex, cells) => processRow(cells),
      Vector()
    )

    bufferedSource.close

    rows.headOption

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
        val line = dimensionCodes.mkString(CsvFile.cellSeparator) + "\n"
        bufferedWriter.write(line)
    }

    survey.forFirst { questionnaireOption =>
      for {
        questionnaire <- questionnaireOption
      } yield
        val questionCodes = questionnaire.map ((questionCode, _) => questionCode)
        val line = questionCodes.mkString(CsvFile.cellSeparator) + "\n"
        bufferedWriter.write(line)
    }

    survey.foreach { questionnaire =>
      val cells = questionnaire.map { (_, valueOption) =>
        valueOption match
          case None => ""
          case Some(value) => value.toString
      }
      val line = cells.mkString(CsvFile.cellSeparator) + "\n"
      bufferedWriter.write(line)
    }

    bufferedWriter.close()


  @tailrec
  private def accumulate[A](
    lines: Iterator[String],
    rowIndex: Int,
    incompleteRowOption: Option[Vector[String]],
    processRow: (Int, Vector[String]) => A,
    rows: Vector[A]
  ): Vector[A] =

    if lines.hasNext then
      val columns = lines.next().split(CsvFile.cellSeparator).map(_.trim).toVector
      incompleteRowOption match
        case Some(incompleteRow) =>
          if columns.head.endsWith(CsvFile.quote) then
            val completeCell = incompleteRow.last + columns.head
            val completeColumns = incompleteRow.init :+ completeCell :++ columns.tail
            val row = processRow(rowIndex, completeColumns)
            accumulate(lines, rowIndex+1, None, processRow, rows.appended(row))
          else
            val continuedCell = incompleteRow.last + columns.head
            val addedColumns = incompleteRow.init :+ continuedCell
            accumulate(lines, rowIndex, Some(addedColumns), processRow, rows)
        case None =>
          if columns.last.startsWith(CsvFile.quote) && !columns.last.endsWith(CsvFile.quote) then
            accumulate(lines, rowIndex, Some(columns), processRow, rows)
          else
            val row = processRow(rowIndex, columns)
            accumulate(lines, rowIndex+1, None, processRow, rows.appended(row))
    else
      rows

object CsvFile:

  val cellSeparator = ";"
  val quote = "\"";