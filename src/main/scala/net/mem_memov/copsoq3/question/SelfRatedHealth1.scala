package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.SelfRatedHealth
import net.mem_memov.copsoq3.scale.Scale7
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object SelfRatedHealth1 extends Question:

  override val code: String = "GH1"

  override val level: Level = Level.Core

  override val dimension: Dimension = SelfRatedHealth

  override val scale: Scale = Scale7

  override val label: String = "General health"

  override val text: String = "In general, would you say your health is:"
