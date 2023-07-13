package net.mem_memov.copsoq3

case class Survey(questionnaires: Vector[Questionnaire])


object Survey:
  
  val empty: Survey = Survey(Vector.empty)