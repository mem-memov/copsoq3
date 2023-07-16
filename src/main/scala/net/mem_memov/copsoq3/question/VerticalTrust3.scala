package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.VerticalTrust
import net.mem_memov.copsoq3.scale.Scale2Reversed
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object VerticalTrust3 extends Question:

  override val code: String = "TM3"

  override val level: Level = Level.Long

  override val dimension: Dimension = VerticalTrust

  override val scale: Scale = Scale2Reversed

  override val label: String = "Management withhold information"

  override val text: String = "Does the management withhold important information from the employees?"
