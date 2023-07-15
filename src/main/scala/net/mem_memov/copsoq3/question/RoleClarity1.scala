package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.RoleClarity
import net.mem_memov.copsoq3.scale.Scale2
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object RoleClarity1 extends Question:

  override val code: String = "CL1"

  override val level: Level = Level.Core

  override val dimension: Dimension = RoleClarity

  override val scale: Scale = Scale2

  override val label: String = "Clear objectives"

  override val text: String = "Does your work have clear objectives?"
