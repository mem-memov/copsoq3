package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.JobInsecurity
import net.mem_memov.copsoq3.scale.Scale2
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object JobInsecurity2 extends Question:

  override val code: String = "JI2"

  override val level: Level = Level.Long

  override val dimension: Dimension = JobInsecurity

  override val scale: Scale = Scale2

  override val label: String = "Redundant"

  override val text: String = "Are you worried about new technology making you redundant?"
