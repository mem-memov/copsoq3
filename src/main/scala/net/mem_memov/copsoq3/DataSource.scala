package net.mem_memov.copsoq3

import net.mem_memov.copsoq3.dataSource.CsvFile

trait DataSource:

  def read[A](
    processRow: (Int, Vector[String]) => A
  ): Vector[A]

  def readFirst[A](
    processRow: Vector[String] => A
  ): Option[A]

  def write(survey: Survey): Unit

object DataSource:

  def csvFile(path: String) =
    new CsvFile(path)