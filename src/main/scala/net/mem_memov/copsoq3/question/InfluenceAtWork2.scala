package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.InfluenceAtWork
import net.mem_memov.copsoq3.scale.Scale1
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object InfluenceAtWork2 extends Question:

  override val code: String = "IN2"

  override val level: Level = Level.Long

  override val dimension: Dimension = InfluenceAtWork

  override val scale: Scale = Scale1

  override val label: String = "Say in choosing colleges"

  override val text: String = "Do you have a say in choosing who you work with?"
