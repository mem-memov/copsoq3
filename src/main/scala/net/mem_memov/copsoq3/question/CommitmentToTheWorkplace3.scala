package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.CommitmentToTheWorkplace
import net.mem_memov.copsoq3.scale.Scale2
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object CommitmentToTheWorkplace3 extends Question:

  override val code: String = "CWX3"

  override val level: Level = Level.Long

  override val dimension: Dimension = CommitmentToTheWorkplace

  override val scale: Scale = Scale2

  override val label: String = "Recommend to other people"

  override val text: String = "Would you recommend other people to apply for a position at your workplace?"
