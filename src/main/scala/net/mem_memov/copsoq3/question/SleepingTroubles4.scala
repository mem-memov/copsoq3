package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.SleepingTroubles
import net.mem_memov.copsoq3.scale.Scale9
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object SleepingTroubles4 extends Question:

  override val code: String = "SL4"

  override val level: Level = Level.Long

  override val dimension: Dimension = SleepingTroubles

  override val scale: Scale = Scale9

  override val label: String = "Woken up several times"

  override val text: String = "How often have you woken up several times and found it difficult to get back to sleep?"
