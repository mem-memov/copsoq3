package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.VerticalTrust
import net.mem_memov.copsoq3.scale.Scale2
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object VerticalTrust2 extends Question:

  override val code: String = "TMX2"

  override val level: Level = Level.Core

  override val dimension: Dimension = VerticalTrust

  override val scale: Scale = Scale2

  override val label: String = "Employees trust information"

  override val text: String = "Can the employees trust the information that comes from the management?"
