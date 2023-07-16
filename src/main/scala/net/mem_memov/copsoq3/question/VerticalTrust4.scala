package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.VerticalTrust
import net.mem_memov.copsoq3.scale.Scale2
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object VerticalTrust4 extends Question:

  override val code: String = "TM4"

  override val level: Level = Level.Middle

  override val dimension: Dimension = VerticalTrust

  override val scale: Scale = Scale2

  override val label: String = "Employees express views"

  override val text: String = "Are the employees able to express their views and feelings?"
