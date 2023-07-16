package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.SelfEfficacy
import net.mem_memov.copsoq3.scale.Scale10
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object SelfEfficacy4 extends Question:

  override val code: String = "SE4"

  override val level: Level = Level.Long

  override val dimension: Dimension = SelfEfficacy

  override val scale: Scale = Scale10

  override val label: String = "Handle unexpected events"

  override val text: String = "I feel confident that I can handle unexpected events."
