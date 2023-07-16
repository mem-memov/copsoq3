package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.HorizontalTrust
import net.mem_memov.copsoq3.scale.Scale2Reversed
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object HorizontalTrust1 extends Question:

  override val code: String = "TE1"

  override val level: Level = Level.Long

  override val dimension: Dimension = HorizontalTrust

  override val scale: Scale = Scale2Reversed

  override val label: String = "Colleagues withhold information"

  override val text: String = "Do the employees withhold information from each other?"
