package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.CognitiveDemands
import net.mem_memov.copsoq3.scale.Scale1
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object CognitiveDemands2 extends Question:

  override val code: String = "CD2"

  override val level: Level = Level.Long

  override val dimension: Dimension = CognitiveDemands

  override val scale: Scale = Scale1

  override val label: String = "Remember a lot"

  override val text: String = "Does your work require that you remember a lot of things?"
