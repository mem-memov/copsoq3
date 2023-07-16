package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.UnpleasantTeasing
import net.mem_memov.copsoq3.scale.Scale4
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object UnpleasantTeasing1 extends Question:

  override val code: String = "UT1"

  override val level: Level = Level.Long

  override val dimension: Dimension = UnpleasantTeasing

  override val scale: Scale = Scale4

  override val label: String = "Unpleasant teasing"

  override val text: String = "Have you been exposed to unpleasant teasing at your workplace during the last 12 months?"
