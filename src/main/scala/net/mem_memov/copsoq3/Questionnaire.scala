package net.mem_memov.copsoq3

case class Questionnaire(valueOptions: Vector[(String, Option[Value])]):

  def addValueOption(questionCode: String, valueOption: Option[Value]): Questionnaire =

    val modifiedValueOptions = valueOptions :+ (questionCode -> valueOption)

    this.copy(valueOptions = modifiedValueOptions)

  def map[A](f: ((String, Option[Value])) => A): Vector[A] =

    valueOptions.map(f)


object Questionnaire:

  val empty: Questionnaire = Questionnaire(Vector.empty[(String, Option[Value])])
