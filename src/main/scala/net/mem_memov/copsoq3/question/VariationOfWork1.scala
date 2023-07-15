package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.QuantitativeDemands
import net.mem_memov.copsoq3.scale.Scale1
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object VariationOfWork1 extends Question:

  override val code: String = "VA1"

  override val level: Level = Level.Long

  override val dimension: Dimension = QuantitativeDemands

  override val scale: Scale = Scale1

  override val label: String = "Work varied"

  override val text: String = "Is your work varied?"
