package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.DemandsForHidingEmotions
import net.mem_memov.copsoq3.scale.Scale2
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object DemandsForHidingEmotions3 extends Question:

  override val code: String = "HE3"

  override val level: Level = Level.Middle

  override val dimension: Dimension = DemandsForHidingEmotions

  override val scale: Scale = Scale2

  override val label: String = "Kind and open"

  override val text: String = "Are you required to be kind and open towards everyone – regardless of how they behave towards"
