package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.RoleClarity
import net.mem_memov.copsoq3.scale.Scale2
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object RoleClarity3 extends Question:

  override val code: String = "CL3"

  override val level: Level = Level.Middle

  override val dimension: Dimension = RoleClarity

  override val scale: Scale = Scale2

  override val label: String = "Expectation"

  override val text: String = "Do you know exactly what is expected of you at work?"
