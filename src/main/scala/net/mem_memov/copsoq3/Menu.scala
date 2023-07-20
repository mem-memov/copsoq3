package net.mem_memov.copsoq3

import scala.annotation.tailrec

object Menu:

  def show: Unit =
    println(Manual.content)

  @tailrec
  def select(survey: Survey): Unit =
    val input = io.StdIn.readLine("Введите команду: ")
    val command = Command(input)
    command match
      case unknown: Command.Unknown =>
        unknown.toOperation.run(survey)
        select(survey)
      case exit: Command.Exit.type =>
        exit.toOperation.run(survey)
        ()
      case load: Command.Load.type =>
        val modifiedSurvey = load.toOperation.run(survey)
        select(modifiedSurvey)
      case save: Command.Save.type =>
        save.toOperation.run(survey)
        select(survey)
