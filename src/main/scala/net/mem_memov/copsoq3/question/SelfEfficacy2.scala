package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.SelfEfficacy
import net.mem_memov.copsoq3.scale.Scale10
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object SelfEfficacy2 extends Question:

  override val code: String = "SE2"

  override val level: Level = Level.Long

  override val dimension: Dimension = SelfEfficacy

  override val scale: Scale = Scale10

  override val label: String = "Achieving what I want"

  override val text: String = "If people work against me, I find a way of achieving what I want."
