package net.mem_memov.copsoq3

import net.mem_memov.copsoq3.dataSource.CsvFile

trait DataSource:

  def load[A](
    processRow: Vector[String] => A
  ): Vector[A]

object DataSource:

  def csvFile(path: String) =
    new CsvFile(path)