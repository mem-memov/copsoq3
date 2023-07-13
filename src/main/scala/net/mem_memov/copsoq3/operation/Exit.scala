package net.mem_memov.copsoq3.operation

import net.mem_memov.copsoq3.{Command, Operation, Survey}

case class Exit(
  command: Command.Exit.type
) extends Operation:

  override def run(survey: Survey): Survey =
    println("Выход из программы")
    survey
