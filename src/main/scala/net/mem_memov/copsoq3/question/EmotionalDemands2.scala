package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.EmotionalDemands
import net.mem_memov.copsoq3.scale.Scale1
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object EmotionalDemands2 extends Question:

  override val code: String = "EDX2"

  override val level: Level = Level.Core

  override val dimension: Dimension = EmotionalDemands

  override val scale: Scale = Scale1

  override val label: String = "Deal with other people's problems"

  override val text: String = "Do you have to deal with other people’s personal problems as part of your work?"