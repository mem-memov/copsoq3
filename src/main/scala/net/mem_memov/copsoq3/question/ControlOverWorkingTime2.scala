package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.ControlOverWorking
import net.mem_memov.copsoq3.scale.Scale1
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object ControlOverWorkingTime2 extends Question:

  override val code: String = "CT2"

  override val level: Level = Level.Middle

  override val dimension: Dimension = ControlOverWorking

  override val scale: Scale = Scale1

  override val label: String = "Take holiday"

  override val text: String = "Can you take holidays more or less when you wish?"
