package net.mem_memov.copsoq3

trait Scale:

  val code: String

  def evaluate(value: String, question: Question, rowIndex: Int): Option[Value]

  def reportUnexpectedValue(value: String, question: Question, rowIndex: Int): Unit =

    if value != "" then
      println("Unknown value in scale " + code + " for question " + question.code + " on row " + (rowIndex + 1) + ": \"" + value + "\"")
    else
      ()

object Scale:

  def prepareValue(value: String): String =

    value
      .trim
      .toLowerCase
      .replace(" /", "/")
      .replace("/ ", "/")
      .replace("  ", " ")

