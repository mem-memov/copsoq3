package net.mem_memov.copsoq3

case class Questionnaire(valueOptions: Map[String, Option[Value]]):

  def addValueOption(questionCode: String, valueOption: Option[Value]): Questionnaire =

    val modifiedValueOptions = valueOptions + (questionCode -> valueOption)

    this.copy(valueOptions = modifiedValueOptions)


object Questionnaire:

  val empty: Questionnaire = Questionnaire(Map.empty[String, Option[Value]])
