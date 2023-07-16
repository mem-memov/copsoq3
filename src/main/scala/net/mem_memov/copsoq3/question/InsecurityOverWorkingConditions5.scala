package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.InsecurityOverWorkingConditions
import net.mem_memov.copsoq3.scale.Scale2Reversed
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object InsecurityOverWorkingConditions5 extends Question:

  override val code: String = "IW5"

  override val level: Level = Level.Long

  override val dimension: Dimension = InsecurityOverWorkingConditions

  override val scale: Scale = Scale2Reversed

  override val label: String = "Good job prospects"

  override val text: String = "Are there good prospects in your job?"
