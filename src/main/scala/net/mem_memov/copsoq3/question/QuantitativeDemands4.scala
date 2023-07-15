package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.QuantitativeDemands
import net.mem_memov.copsoq3.scale.Scale1Reversed
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object QuantitativeDemands4 extends Question:

  override val code: String = "QD4"

  override val level: Level = Level.Core

  override val dimension: Dimension = QuantitativeDemands

  override val scale: Scale = Scale1Reversed

  override val label: String = "Enough time"

  override val text: String = "Do you have enough time for your work tasks?"

