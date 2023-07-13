package net.mem_memov.copsoq3.operation

import net.mem_memov.copsoq3.{Command, Operation, Survey}

case class Unknown(
  command: Command.Unknown
) extends Operation:

  override def run(survey: Survey): Survey =
    println(s"Неизвестная команда: ${command.name}")
    survey
