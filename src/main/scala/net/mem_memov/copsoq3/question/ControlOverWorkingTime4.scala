package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.ControlOverWorkingTime
import net.mem_memov.copsoq3.scale.Scale1
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object ControlOverWorkingTime4 extends Question:

  override val code: String = "CT4"

  override val level: Level = Level.Middle

  override val dimension: Dimension = ControlOverWorkingTime

  override val scale: Scale = Scale1

  override val label: String = "Private business"

  override val text: String = "If you have some private business is it possible for you to leave your place of work for half an hour without special permission?"
