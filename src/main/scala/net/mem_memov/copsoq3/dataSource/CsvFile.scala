package net.mem_memov.copsoq3.dataSource

import net.mem_memov.copsoq3.DataSource

import scala.annotation.tailrec
import scala.collection.Iterator

case class CsvFile(path: String) extends DataSource:

  def load[A](
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

