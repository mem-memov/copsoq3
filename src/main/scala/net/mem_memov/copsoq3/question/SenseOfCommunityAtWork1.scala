package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.SenseOfCommunityAtWork
import net.mem_memov.copsoq3.scale.Scale1Dagger
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object SenseOfCommunityAtWork1 extends Question:

  override val code: String = "SW1"

  override val level: Level = Level.Core

  override val dimension: Dimension = SenseOfCommunityAtWork

  override val scale: Scale = Scale1Dagger

  override val label: String = "Atmosphere"

  override val text: String = "Is there a good atmosphere between you and your colleagues?"
