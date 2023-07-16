package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.OrganizationalJustice
import net.mem_memov.copsoq3.scale.Scale2
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object OrganizationalJustice1 extends Question:

  override val code: String = "JU1"

  override val level: Level = Level.Core

  override val dimension: Dimension = OrganizationalJustice

  override val scale: Scale = Scale2

  override val label: String = "Conflicts resolved fairly"

  override val text: String = "Are conflicts resolved in a fair way?"
