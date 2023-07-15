package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.RoleConflicts
import net.mem_memov.copsoq3.scale.Scale2
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object RoleConflicts2 extends Question:

  override val code: String = "CO2"

  override val level: Level = Level.Core

  override val dimension: Dimension = RoleConflicts

  override val scale: Scale = Scale2

  override val label: String = "Contradictory demands"

  override val text: String = "Are contradictory demands placed on you at work?"
