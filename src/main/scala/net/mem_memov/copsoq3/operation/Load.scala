package net.mem_memov.copsoq3.operation

import net.mem_memov.copsoq3.{Command, Operation, Survey}

case class Load(
  command: Command.Load.type
) extends Operation:

  override def run(survey: Survey): Survey =

    survey
