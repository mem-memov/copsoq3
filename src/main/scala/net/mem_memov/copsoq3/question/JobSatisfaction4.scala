package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.JobSatisfaction
import net.mem_memov.copsoq3.scale.Scale6
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object JobSatisfaction4 extends Question:

  override val code: String = "JS4"

  override val level: Level = Level.Core

  override val dimension: Dimension = JobSatisfaction

  override val scale: Scale = Scale6

  override val label: String = "Job in general"

  override val text: String = "your job as a whole, everything taken into consideration?"
