package net.mem_memov.copsoq3.operation

import net.mem_memov.copsoq3.{Command, DataSource, Operation, Survey}

case class Load(
  command: Command.Load.type
) extends Operation:

  override def run(survey: Survey): Survey =

    val path = io.StdIn.readLine("Укажите путь к файлу в формате CSV: ")

    val dataSource = DataSource.csvFile(path)

    dataSource.load { row =>
      println(row)
      ()
    }

    survey
