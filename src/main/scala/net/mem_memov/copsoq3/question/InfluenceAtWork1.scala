package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.InfluenceAtWork
import net.mem_memov.copsoq3.scale.Scale1
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object InfluenceAtWork1 extends Question:

  override val code: String = "INX1"

  override val level: Level = Level.Core

  override val dimension: Dimension = InfluenceAtWork

  override val scale: Scale = Scale1

  override val label: String = "Influence decisions on work"

  override val text: String = "Do you have a large degree of influence on the decisions concerning your work?"
