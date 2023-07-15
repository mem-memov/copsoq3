package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.RoleConflicts
import net.mem_memov.copsoq3.scale.Scale2
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object RoleConflicts3 extends Question:

  override val code: String = "CO3"

  override val level: Level = Level.Core

  override val dimension: Dimension = RoleConflicts

  override val scale: Scale = Scale2

  override val label: String = "Do things wrongly"

  override val text: String = "Do you sometimes have to do things which ought to have been done in a different way?"
