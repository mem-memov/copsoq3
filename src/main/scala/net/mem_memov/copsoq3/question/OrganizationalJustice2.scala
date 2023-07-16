package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.OrganizationalJustice
import net.mem_memov.copsoq3.scale.Scale2
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object OrganizationalJustice2 extends Question:

  override val code: String = "JU2"

  override val level: Level = Level.Long

  override val dimension: Dimension = OrganizationalJustice

  override val scale: Scale = Scale2

  override val label: String = "Employees appreciated"

  override val text: String = "Are employees appreciated when they have done a good job?"
