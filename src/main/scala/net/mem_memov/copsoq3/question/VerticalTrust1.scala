package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.VerticalTrust
import net.mem_memov.copsoq3.scale.Scale2
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object VerticalTrust1 extends Question:

  override val code: String = "TM1"

  override val level: Level = Level.Core

  override val dimension: Dimension = VerticalTrust

  override val scale: Scale = Scale2

  override val label: String = "Management trust employees"

  override val text: String = "Does the management trust the employees to do their work well?"
