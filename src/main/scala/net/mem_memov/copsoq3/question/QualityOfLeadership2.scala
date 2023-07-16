package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.QualityOfLeadership
import net.mem_memov.copsoq3.scale.Scale2Dagger
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object QualityOfLeadership2 extends Question:

  override val code: String = "QL2"

  override val level: Level = Level.Long

  override val dimension: Dimension = QualityOfLeadership

  override val scale: Scale = Scale2Dagger

  override val label: String = "Prioritize job satisfaction"

  override val text: String = "gives high priority to job satisfaction?"
