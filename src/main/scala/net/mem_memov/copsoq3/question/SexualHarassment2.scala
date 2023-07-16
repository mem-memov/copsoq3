package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.SexualHarassment
import net.mem_memov.copsoq3.scale.Scale5Multiple
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object SexualHarassment2 extends Question:

  override val code: String = "SH2"

  override val level: Level = Level.Long

  override val dimension: Dimension = SexualHarassment

  override val scale: Scale = Scale5Multiple

  override val label: String = ""

  override val text: String = "If yes, from whom? (You may tick off more than one) "
