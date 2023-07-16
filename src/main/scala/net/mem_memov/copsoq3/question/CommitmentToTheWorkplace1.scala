package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.CommitmentToTheWorkplace
import net.mem_memov.copsoq3.scale.Scale2
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object CommitmentToTheWorkplace1 extends Question:

  override val code: String = "CW1"

  override val level: Level = Level.Long

  override val dimension: Dimension = CommitmentToTheWorkplace

  override val scale: Scale = Scale2

  override val label: String = "Enjoy telling others"

  override val text: String = "Do you enjoy telling others about your place of work?"
