package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.InsecurityOverWorkingConditions
import net.mem_memov.copsoq3.scale.Scale2
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object InsecurityOverWorkingConditions3 extends Question:

  override val code: String = "IW3"

  override val level: Level = Level.Middle

  override val dimension: Dimension = InsecurityOverWorkingConditions

  override val scale: Scale = Scale2

  override val label: String = "Changed working time"

  override val text: String = "Are you worried about the timetable being changed (shift, weekdays, time to enter and leave ...) against your will?"
