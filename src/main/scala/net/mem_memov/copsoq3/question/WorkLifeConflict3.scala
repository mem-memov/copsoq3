package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.WorkLifeConflict
import net.mem_memov.copsoq3.scale.Scale2
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object WorkLifeConflict3 extends Question:

  override val code: String = "WF3"

  override val level: Level = Level.Core

  override val dimension: Dimension = WorkLifeConflict

  override val scale: Scale = Scale2

  override val label: String = "Time conflict"

  override val text: String = "Do you feel that your work takes so much of your time that it has a negative effect on your private life?"
