package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.DemandsForHidingEmotions
import net.mem_memov.copsoq3.scale.Scale1
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object DemandsForHidingEmotions1 extends Question:

  override val code: String = "HE1"

  override val level: Level = Level.Long

  override val dimension: Dimension = DemandsForHidingEmotions

  override val scale: Scale = Scale1

  override val label: String = "Treat equally"

  override val text: String = "Are you required to treat everyone equally, even if you do not feel like it?"
