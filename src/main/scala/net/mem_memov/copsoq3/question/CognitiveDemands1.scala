package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.CognitiveDemands
import net.mem_memov.copsoq3.scale.Scale1
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object CognitiveDemands1 extends Question:

  override val code: String = "CD1"

  override val level: Level = Level.Long

  override val dimension: Dimension = CognitiveDemands

  override val scale: Scale = Scale1

  override val label: String = "Eyes on lots of things"

  override val text: String = "Do you have to keep your eyes on lots of things while you work?"
