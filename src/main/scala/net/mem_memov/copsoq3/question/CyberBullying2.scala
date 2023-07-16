package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.CyberBullying
import net.mem_memov.copsoq3.scale.Scale5Multiple
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object CyberBullying2 extends Question:

  override val code: String = "HSM2"

  override val level: Level = Level.Long

  override val dimension: Dimension = CyberBullying

  override val scale: Scale = Scale5Multiple

  override val label: String = "Cyber bullying"

  override val text: String = "If yes, from whom? (You may tick off more than one)"
