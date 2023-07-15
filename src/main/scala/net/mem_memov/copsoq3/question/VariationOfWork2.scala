package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.QuantitativeDemands
import net.mem_memov.copsoq3.scale.Scale1Reversed
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object VariationOfWork2 extends Question:

  override val code: String = "VA2"

  override val level: Level = Level.Long

  override val dimension: Dimension = QuantitativeDemands

  override val scale: Scale = Scale1Reversed

  override val label: String = "Do things over and over again"

  override val text: String = "Do you have to do the same thing over and over again?"
