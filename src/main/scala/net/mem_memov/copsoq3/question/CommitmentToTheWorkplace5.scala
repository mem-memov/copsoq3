package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.CommitmentToTheWorkplace
import net.mem_memov.copsoq3.scale.Scale2
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object CommitmentToTheWorkplace5 extends Question:

  override val code: String = "CW5"

  override val level: Level = Level.Long

  override val dimension: Dimension = CommitmentToTheWorkplace

  override val scale: Scale = Scale2

  override val label: String = "Proud"

  override val text: String = "Are you proud of being part of this organization?"
