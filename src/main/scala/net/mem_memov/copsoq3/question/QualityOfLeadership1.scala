package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.QualityOfLeadership
import net.mem_memov.copsoq3.scale.Scale2Dagger
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object QualityOfLeadership1 extends Question:

  override val code: String = "QLX1"

  override val level: Level = Level.Middle

  override val dimension: Dimension = QualityOfLeadership

  override val scale: Scale = Scale2Dagger

  override val label: String = "Development opportunities"

  override val text: String = "To what extent would you say that your immediate superior makes sure that the members of staff have good development opportunities?"
