package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.WorkEngagement
import net.mem_memov.copsoq3.scale.Scale3
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object WorkEngagement2 extends Question:

  override val code: String = "WE2"

  override val level: Level = Level.Long

  override val dimension: Dimension = WorkEngagement

  override val scale: Scale = Scale3

  override val label: String = "Enthusiastic"

  override val text: String = "I am enthusiastic about my job."
