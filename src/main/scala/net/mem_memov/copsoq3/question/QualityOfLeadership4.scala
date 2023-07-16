package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.QualityOfLeadership
import net.mem_memov.copsoq3.scale.Scale2Dagger
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object QualityOfLeadership4 extends Question:

  override val code: String = "QL4"

  override val level: Level = Level.Core

  override val dimension: Dimension = QualityOfLeadership

  override val scale: Scale = Scale2Dagger

  override val label: String = "Solving conflicts"

  override val text: String = "is good at solving conflicts?"
