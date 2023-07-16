package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.JobSatisfaction
import net.mem_memov.copsoq3.scale.Scale6
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object JobSatisfaction3 extends Question:

  override val code: String = "JS3"

  override val level: Level = Level.Long

  override val dimension: Dimension = JobSatisfaction

  override val scale: Scale = Scale6

  override val label: String = "Work abilities"

  override val text: String = "the way your abilities are used?"
