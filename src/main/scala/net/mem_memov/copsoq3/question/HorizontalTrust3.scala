package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.HorizontalTrust
import net.mem_memov.copsoq3.scale.Scale2
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object HorizontalTrust3 extends Question:

  override val code: String = "TE3"

  override val level: Level = Level.Middle

  override val dimension: Dimension = HorizontalTrust

  override val scale: Scale = Scale2

  override val label: String = "Trust colleagues"

  override val text: String = "Do the employees in general trust each other?"
