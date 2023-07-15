package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.SenseOfCommunityAtWork
import net.mem_memov.copsoq3.scale.Scale1Dagger
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object SenseOfCommunityAtWork2 extends Question:

  override val code: String = "SW2"

  override val level: Level = Level.Long

  override val dimension: Dimension = SenseOfCommunityAtWork

  override val scale: Scale = Scale1Dagger

  override val label: String = "Cooperation"

  override val text: String = "Is there good co-operation between the colleagues at work?"
