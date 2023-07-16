package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.WorkEngagement
import net.mem_memov.copsoq3.scale.Scale3
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object WorkEngagement3 extends Question:

  override val code: String = "WE3"

  override val level: Level = Level.Long

  override val dimension: Dimension = WorkEngagement

  override val scale: Scale = Scale3

  override val label: String = "Immersed"

  override val text: String = "I am immersed in my work."
