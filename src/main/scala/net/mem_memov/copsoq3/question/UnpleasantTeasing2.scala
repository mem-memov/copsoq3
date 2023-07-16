package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.UnpleasantTeasing
import net.mem_memov.copsoq3.scale.Scale5Multiple
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object UnpleasantTeasing2 extends Question:

  override val code: String = "UT2"

  override val level: Level = Level.Long

  override val dimension: Dimension = UnpleasantTeasing

  override val scale: Scale = Scale5Multiple

  override val label: String = ""

  override val text: String = "If yes, from whom? (You may tick off more than one)"
