package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.SelfEfficacy
import net.mem_memov.copsoq3.scale.Scale10
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object SelfEfficacy5 extends Question:

  override val code: String = "SE5"

  override val level: Level = Level.Long

  override val dimension: Dimension = SelfEfficacy

  override val scale: Scale = Scale10

  override val label: String = "Several ways solving problems"

  override val text: String = "When I have a problem, I can usually find several ways of solving it."
