package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}
import net.mem_memov.copsoq3.dimension.QuantitativeDemands
import net.mem_memov.copsoq3.scale.Scale1

object QuantitativeDemands1 extends Question:

  override val code: String = "QD1"

  override val level: Level = Level.Middle

  override val dimension: Dimension = QuantitativeDemands

  override val scale: Scale = Scale1

  override val label: String = "Work piles up"

  override val text: String = "Is your workload unevenly distributed so it piles up?"

