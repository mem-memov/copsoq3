package net.mem_memov.copsoq3.operation

import net.mem_memov.copsoq3.{Command, DataSource, Operation, Survey}

case class Save(
  command: Command.Save.type
) extends Operation:

  def run(survey: Survey): Survey =

    println("Выгрузка в файл")

    val path = io.StdIn.readLine("Укажите путь к файлу в формате CSV: ")

    val dataSource = DataSource.csvFile(path)

    dataSource.write(survey)

    survey