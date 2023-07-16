package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.OrganizationalJustice
import net.mem_memov.copsoq3.scale.Scale2
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object OrganizationalJustice4 extends Question:

  override val code: String = "JU4"

  override val level: Level = Level.Core

  override val dimension: Dimension = OrganizationalJustice

  override val scale: Scale = Scale2

  override val label: String = "Work distributed fairly"

  override val text: String = "Is the work distributed fairly?"
