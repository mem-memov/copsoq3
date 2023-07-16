package net.mem_memov.copsoq3

trait Scale:

  val code: String

  def evaluate(value: String): Option[Value]
