package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.DemandsForHidingEmotions
import net.mem_memov.copsoq3.scale.Scale1
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object DemandsForHidingEmotions4 extends Question:

  override val code: String = "HE4"

  override val level: Level = Level.Middle

  override val dimension: Dimension = DemandsForHidingEmotions

  override val scale: Scale = Scale1

  override val label: String = "Not state own opinion"

  override val text: String = "Does your work require that you do not state your opinion?"
