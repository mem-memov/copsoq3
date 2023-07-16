package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.QualityOfWork
import net.mem_memov.copsoq3.scale.Scale2
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object QualityOfWork2 extends Question:

  override val code: String = "QW2"

  override val level: Level = Level.Middle

  override val dimension: Dimension = QualityOfWork

  override val scale: Scale = Scale2

  override val label: String = "Satisfied at workplace level"

  override val text: String = "Are you satisfied with the quality of the work performed at your workplace?"
