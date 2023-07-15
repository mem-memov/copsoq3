package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.MeaningOfWork
import net.mem_memov.copsoq3.scale.Scale2
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object MeaningOfWork1 extends Question:

  override val code: String = "MW1"

  override val level: Level = Level.Core

  override val dimension: Dimension = MeaningOfWork

  override val scale: Scale = Scale2

  override val label: String = "Work meaningful"

  override val text: String = "Is your work meaningful?"
