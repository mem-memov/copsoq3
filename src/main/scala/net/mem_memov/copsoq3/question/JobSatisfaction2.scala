package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.JobSatisfaction
import net.mem_memov.copsoq3.scale.Scale6
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object JobSatisfaction2 extends Question:

  override val code: String = "JS2"

  override val level: Level = Level.Long

  override val dimension: Dimension = JobSatisfaction

  override val scale: Scale = Scale6

  override val label: String = "Work conditions"

  override val text: String = "the physical working conditions?"
