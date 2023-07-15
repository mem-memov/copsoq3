package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.InfluenceAtWork
import net.mem_memov.copsoq3.scale.Scale1
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object InfluenceAtWork6 extends Question:

  override val code: String = "IN6"

  override val level: Level = Level.Middle

  override val dimension: Dimension = InfluenceAtWork

  override val scale: Scale = Scale1

  override val label: String = "How you work"

  override val text: String = "Do you have any influence on HOW you do your work?"
