package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.MeaningOfWork
import net.mem_memov.copsoq3.scale.Scale2
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object MeaningOfWork2 extends Question:

  override val code: String = "MW2"

  override val level: Level = Level.Middle

  override val dimension: Dimension = MeaningOfWork

  override val scale: Scale = Scale2

  override val label: String = "Work important"

  override val text: String = "Do you feel that the work you do is important?"
