package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.DemandsForHidingEmotions
import net.mem_memov.copsoq3.scale.Scale2
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object DemandsForHidingEmotions2 extends Question:

  override val code: String = "HE2"

  override val level: Level = Level.Middle

  override val dimension: Dimension = DemandsForHidingEmotions

  override val scale: Scale = Scale2

  override val label: String = "Hide feelings"

  override val text: String = "Does your work require that you hide your feelings?"
