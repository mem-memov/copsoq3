package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.SomaticStress
import net.mem_memov.copsoq3.scale.Scale9
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object SomaticStress4 extends Question:

  override val code: String = "SO4"

  override val level: Level = Level.Long

  override val dimension: Dimension = SomaticStress

  override val scale: Scale = Scale9

  override val label: String = "Palpitations"

  override val text: String = "How often have you had tension in various muscles?"
