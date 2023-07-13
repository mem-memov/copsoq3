package net.mem_memov.copsoq3

sealed trait Command:

  def make(): Unit

object Command:

  import net.mem_memov.copsoq3.command.Exit.given

  object Exit extends Command
  object Load extends Command

  def apply(name: String): Command =
    name match
      case "exit" => Exit
//      case "load" => Load