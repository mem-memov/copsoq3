package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.SenseOfCommunityAtWork
import net.mem_memov.copsoq3.scale.Scale1Dagger
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object SenseOfCommunityAtWork3 extends Question:

  override val code: String = "SW3"

  override val level: Level = Level.Middle

  override val dimension: Dimension = SenseOfCommunityAtWork

  override val scale: Scale = Scale1Dagger

  override val label: String = "Community"

  override val text: String = "Do you feel part of a community at your place of work?"
