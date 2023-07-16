package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.WorkLifeConflict
import net.mem_memov.copsoq3.scale.Scale1
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object WorkLifeConflict1 extends Question:

  override val code: String = "WFX1"

  override val level: Level = Level.Long

  override val dimension: Dimension = WorkLifeConflict

  override val scale: Scale = Scale1

  override val label: String = "Being in both place"

  override val text: String = "Are there times when you need to be at work and at home at the same time?"
