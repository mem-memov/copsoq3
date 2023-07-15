package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.RoleClarity
import net.mem_memov.copsoq3.scale.Scale2
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object RoleClarity2 extends Question:

  override val code: String = "CL2"

  override val level: Level = Level.Middle

  override val dimension: Dimension = RoleClarity

  override val scale: Scale = Scale2

  override val label: String = "Responsibility"

  override val text: String = "Do you know exactly which areas are your responsibility?"
