package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.JobSatisfaction
import net.mem_memov.copsoq3.scale.Scale6
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object JobSatisfaction5 extends Question:

  override val code: String = "JS5"

  override val level: Level = Level.Middle

  override val dimension: Dimension = JobSatisfaction

  override val scale: Scale = Scale6

  override val label: String = "Salary"

  override val text: String = "your salary?"
