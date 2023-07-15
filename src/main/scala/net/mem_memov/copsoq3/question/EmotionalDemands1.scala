package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.EmotionalDemands
import net.mem_memov.copsoq3.scale.Scale1
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object EmotionalDemands1 extends Question:

  override val code: String = "ED1"

  override val level: Level = Level.Middle

  override val dimension: Dimension = EmotionalDemands

  override val scale: Scale = Scale1

  override val label: String = "Emotional disturbing"

  override val text: String = "Does your work put you in emotionally disturbing situations?"