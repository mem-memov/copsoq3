package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.InsecurityOverWorkingConditions
import net.mem_memov.copsoq3.scale.Scale2
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object InsecurityOverWorkingConditions2 extends Question:

  override val code: String = "IW2"

  override val level: Level = Level.Long

  override val dimension: Dimension = InsecurityOverWorkingConditions

  override val scale: Scale = Scale2

  override val label: String = "Transferred another task"

  override val text: String = "Are you worried about your working tasks being changed against your will?"
