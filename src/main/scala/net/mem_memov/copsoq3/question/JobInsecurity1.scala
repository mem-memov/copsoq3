package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.JobInsecurity
import net.mem_memov.copsoq3.scale.Scale2
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object JobInsecurity1 extends Question:

  override val code: String = "JI1"

  override val level: Level = Level.Core

  override val dimension: Dimension = JobInsecurity

  override val scale: Scale = Scale2

  override val label: String = "Unemployed"

  override val text: String = "Are you worried about becoming unemployed?"
