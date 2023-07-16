package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.CommitmentToTheWorkplace
import net.mem_memov.copsoq3.scale.Scale2
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object CommitmentToTheWorkplace2 extends Question:

  override val code: String = "CW2"

  override val level: Level = Level.Long

  override val dimension: Dimension = CommitmentToTheWorkplace

  override val scale: Scale = Scale2

  override val label: String = "Workplace great importance"

  override val text: String = "Do you feel that your place of work is of great importance to you?"
