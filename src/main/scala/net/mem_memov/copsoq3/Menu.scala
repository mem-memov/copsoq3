package net.mem_memov.copsoq3

import scala.annotation.tailrec

object Menu:

  @tailrec
  def show(survey: Survey): Unit =
    val input = io.StdIn.readLine("Введите команду: ")
    val command = Command(input)
    command match
      case unknown: Command.Unknown =>
        unknown.toOperation.run(survey)
        show(survey)
      case exit: Command.Exit.type =>
        exit.toOperation.run(survey)
        ()
      case load: Command.Load.type =>
        val modifiedSurvey = load.toOperation.run(survey)
        show(modifiedSurvey)
