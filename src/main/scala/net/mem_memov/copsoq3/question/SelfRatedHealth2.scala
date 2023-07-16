package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.SelfRatedHealth
import net.mem_memov.copsoq3.scale.Scale8
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object SelfRatedHealth2 extends Question:

  override val code: String = "GH2"

  override val level: Level = Level.Long

  override val dimension: Dimension = SelfRatedHealth

  override val scale: Scale = Scale8

  override val label: String = "Rate in 10 points"

  override val text: String = "If you evaluate the best conceivable state of health at 10 points and the worst at 0 points: how many points do you then give your present state of health?"
