package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.Bullying
import net.mem_memov.copsoq3.scale.Scale4
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object Bullying1 extends Question:

  override val code: String = "BU1"

  override val level: Level = Level.Long

  override val dimension: Dimension = Bullying

  override val scale: Scale = Scale4

  override val label: String = "Bullying"

  override val text: String = "Bullying means that a person repeatedly is exposed to unpleasant or degrading treatment, and that the person finds it difficult to defend himself or herself against it. Have you been exposed to bullying at your workplace during the last 12 months?"
