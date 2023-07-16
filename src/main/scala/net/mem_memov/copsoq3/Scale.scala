package net.mem_memov.copsoq3

trait Scale:

  def evaluate(value: String): Option[Value]
