package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.HorizontalTrust
import net.mem_memov.copsoq3.scale.Scale2Reversed
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object HorizontalTrust2 extends Question:

  override val code: String = "TE2"

  override val level: Level = Level.Long

  override val dimension: Dimension = HorizontalTrust

  override val scale: Scale = Scale2Reversed

  override val label: String = "Withhold information management"

  override val text: String = "Do the employees withhold information from the management?"
