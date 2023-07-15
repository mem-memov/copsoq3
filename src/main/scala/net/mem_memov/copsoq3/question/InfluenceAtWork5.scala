package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.InfluenceAtWork
import net.mem_memov.copsoq3.scale.Scale1
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object InfluenceAtWork5 extends Question:

  override val code: String = "IN5"

  override val level: Level = Level.Long

  override val dimension: Dimension = InfluenceAtWork

  override val scale: Scale = Scale1

  override val label: String = "Work Pace"

  override val text: String = "Can you influence how quickly you work?"
