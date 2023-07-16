package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.InsecurityOverWorkingConditions
import net.mem_memov.copsoq3.scale.Scale2
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object InsecurityOverWorkingConditions4 extends Question:

  override val code: String = "IW4"

  override val level: Level = Level.Middle

  override val dimension: Dimension = InsecurityOverWorkingConditions

  override val scale: Scale = Scale2

  override val label: String = "Decreased salary"

  override val text: String = "Are you worried about a decrease in your salary (reduction, variable pay being introduced ...)?"
