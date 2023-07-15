package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.QuantitativeDemands
import net.mem_memov.copsoq3.scale.Scale1
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object QuantitativeDemands2 extends Question:

  override val code: String = "QD2"

  override val level: Level = Level.Core

  override val dimension: Dimension = QuantitativeDemands

  override val scale: Scale = Scale1

  override val label: String = "Complete task"

  override val text: String = "How often do you not have time to complete all your work tasks?"

