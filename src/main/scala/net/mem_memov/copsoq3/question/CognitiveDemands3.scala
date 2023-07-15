package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.CognitiveDemands
import net.mem_memov.copsoq3.scale.Scale1
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object CognitiveDemands3 extends Question:

  override val code: String = "CD3"

  override val level: Level = Level.Long

  override val dimension: Dimension = CognitiveDemands

  override val scale: Scale = Scale1

  override val label: String = "New ideas"

  override val text: String = "Does your work demand that you are good at coming up with new ideas?"
