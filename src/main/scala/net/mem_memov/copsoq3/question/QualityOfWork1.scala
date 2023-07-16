package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.QualityOfWork
import net.mem_memov.copsoq3.scale.Scale2
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object QualityOfWork1 extends Question:

  override val code: String = "QW1"

  override val level: Level = Level.Long

  override val dimension: Dimension = QualityOfWork

  override val scale: Scale = Scale2

  override val label: String = "Possible to perform own tasks"

  override val text: String = "To what extent do you find it possible to perform your work tasks at a satisfactory quality?"
