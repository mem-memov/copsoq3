package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.DepressiveSymptoms
import net.mem_memov.copsoq3.scale.Scale9
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object DepressiveSymptoms4 extends Question:

  override val code: String = "DS4"

  override val level: Level = Level.Long

  override val dimension: Dimension = DepressiveSymptoms

  override val scale: Scale = Scale9

  override val label: String = "Lack of interest in daily activity"

  override val text: String = "How often have you lacked interest in everyday things?"