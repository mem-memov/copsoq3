package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.WorkEngagement
import net.mem_memov.copsoq3.scale.Scale3
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object WorkEngagement1 extends Question:

  override val code: String = "WE1"

  override val level: Level = Level.Long

  override val dimension: Dimension = WorkEngagement

  override val scale: Scale = Scale3

  override val label: String = "Burst with energy"

  override val text: String = "At my work, I feel bursting with energy."
