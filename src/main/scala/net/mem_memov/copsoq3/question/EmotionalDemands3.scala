package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.EmotionalDemands
import net.mem_memov.copsoq3.scale.Scale2
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object EmotionalDemands3 extends Question:

  override val code: String = "ED3"

  override val level: Level = Level.Core

  override val dimension: Dimension = EmotionalDemands

  override val scale: Scale = Scale2

  override val label: String = "Emotionally demanding"

  override val text: String = "Is your work emotionally demanding?"