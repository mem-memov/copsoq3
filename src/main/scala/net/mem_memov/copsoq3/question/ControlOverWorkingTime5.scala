package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.ControlOverWorkingTime
import net.mem_memov.copsoq3.scale.Scale1Reversed
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object ControlOverWorkingTime5 extends Question:

  override val code: String = "CT5"

  override val level: Level = Level.Long

  override val dimension: Dimension = ControlOverWorkingTime

  override val scale: Scale = Scale1Reversed

  override val label: String = "Overtime"

  override val text: String = "Do you have to do overtime?"
