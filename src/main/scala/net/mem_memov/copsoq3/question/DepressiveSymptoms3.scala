package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.DepressiveSymptoms
import net.mem_memov.copsoq3.scale.Scale9
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object DepressiveSymptoms3 extends Question:

  override val code: String = "DS3"

  override val level: Level = Level.Long

  override val dimension: Dimension = DepressiveSymptoms

  override val scale: Scale = Scale9

  override val label: String = "Feel guilty"

  override val text: String = "How often have you had a bad conscience or felt guilty?"