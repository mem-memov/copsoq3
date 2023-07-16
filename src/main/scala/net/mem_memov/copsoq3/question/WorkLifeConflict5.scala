package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.WorkLifeConflict
import net.mem_memov.copsoq3.scale.Scale2
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object WorkLifeConflict5 extends Question:

  override val code: String = "WF5"

  override val level: Level = Level.Long

  override val dimension: Dimension = WorkLifeConflict

  override val scale: Scale = Scale2

  override val label: String = "Work demands interfere"

  override val text: String = "The demands of my work interfere with my private and family life?"
