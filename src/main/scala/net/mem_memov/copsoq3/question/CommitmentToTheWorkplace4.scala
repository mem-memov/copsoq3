package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.CommitmentToTheWorkplace
import net.mem_memov.copsoq3.scale.Scale1Reversed
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object CommitmentToTheWorkplace4 extends Question:

  override val code: String = "CW4"

  override val level: Level = Level.Long

  override val dimension: Dimension = CommitmentToTheWorkplace

  override val scale: Scale = Scale1Reversed

  override val label: String = "Looking for work elsewhere"

  override val text: String = "How often do you consider looking for work elsewhere?"
