package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.InsecurityOverWorkingConditions
import net.mem_memov.copsoq3.scale.Scale2
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object InsecurityOverWorkingConditions1 extends Question:

  override val code: String = "IW1"

  override val level: Level = Level.Core

  override val dimension: Dimension = InsecurityOverWorkingConditions

  override val scale: Scale = Scale2

  override val label: String = "Transferred another job"

  override val text: String = "Are you worried about being transferred to another job against your will?"
