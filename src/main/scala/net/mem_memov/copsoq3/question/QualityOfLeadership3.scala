package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.QualityOfLeadership
import net.mem_memov.copsoq3.scale.Scale2Dagger
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object QualityOfLeadership3 extends Question:

  override val code: String = "QL3"

  override val level: Level = Level.Core

  override val dimension: Dimension = QualityOfLeadership

  override val scale: Scale = Scale2Dagger

  override val label: String = "Work planning"

  override val text: String = "To what extent would you say that your immediate superior is good at work planning?"
