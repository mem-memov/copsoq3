package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.Burnout
import net.mem_memov.copsoq3.scale.Scale9
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object Burnout2 extends Question:

  override val code: String = "BO2"

  override val level: Level = Level.Long

  override val dimension: Dimension = Burnout

  override val scale: Scale = Scale9

  override val label: String = "Physically exhausted"

  override val text: String = "How often have you been physically exhausted?"
