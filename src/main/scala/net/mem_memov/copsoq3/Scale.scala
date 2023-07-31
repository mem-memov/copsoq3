package net.mem_memov.copsoq3

trait Scale:

  val code: String

  def evaluate(value: String): Option[Value]

  def reportUnexpectedValue(value: String): Unit =

    if value != "" then
      println("Unknown value in scale " + code + ": \"" + value + "\"")
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

