package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.InfluenceAtWork
import net.mem_memov.copsoq3.scale.Scale1
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object InfluenceAtWork4 extends Question:

  override val code: String = "IN4"

  override val level: Level = Level.Middle

  override val dimension: Dimension = InfluenceAtWork

  override val scale: Scale = Scale1

  override val label: String = "Influence work task"

  override val text: String = "Do you have any influence on what you do at work?"
