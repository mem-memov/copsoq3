package net.mem_memov.copsoq3

trait Format:

  val columnOffset: Int

  val rowOffset: Int

  def getColumnNumber(questionEnumeration: QuestionEnumeration): Option[Int]
