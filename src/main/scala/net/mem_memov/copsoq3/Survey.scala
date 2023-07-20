package net.mem_memov.copsoq3

case class Survey(questionnaires: Vector[Questionnaire]):

  def addQuestionnaire(questionnaire: Questionnaire): Survey =

    val modifiedQuestionnaires = questionnaires.appended(questionnaire)

    this.copy(questionnaires = modifiedQuestionnaires)

  def foreach(f: Questionnaire => Unit): Unit =

    questionnaires.foreach(f)

object Survey:
  
  val empty: Survey = Survey(Vector.empty)