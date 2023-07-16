package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.DepressiveSymptoms
import net.mem_memov.copsoq3.scale.Scale9
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object DepressiveSymptoms2 extends Question:

  override val code: String = "DS2"

  override val level: Level = Level.Long

  override val dimension: Dimension = DepressiveSymptoms

  override val scale: Scale = Scale9

  override val label: String = "Lack of self-confidence"

  override val text: String = "How often have you lacked self-confidence?"