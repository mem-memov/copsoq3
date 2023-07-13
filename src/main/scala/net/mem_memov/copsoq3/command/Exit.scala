package net.mem_memov.copsoq3.command

import net.mem_memov.copsoq3.Command

object Exit:

  given Command[Command.Exit] with

    override def execute(): Unit = ???
