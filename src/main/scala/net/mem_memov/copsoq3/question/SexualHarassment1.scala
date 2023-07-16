package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.SexualHarassment
import net.mem_memov.copsoq3.scale.Scale4
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object SexualHarassment1 extends Question:

  override val code: String = "SH1"

  override val level: Level = Level.Long

  override val dimension: Dimension = SexualHarassment

  override val scale: Scale = Scale4

  override val label: String = "Sexual harassment"

  override val text: String = "Have you been exposed to undesired sexual attention at your workplace during the last 12 months?"
