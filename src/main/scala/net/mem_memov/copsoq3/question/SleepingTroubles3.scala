package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.SleepingTroubles
import net.mem_memov.copsoq3.scale.Scale9
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object SleepingTroubles3 extends Question:

  override val code: String = "SL3"

  override val level: Level = Level.Long

  override val dimension: Dimension = SleepingTroubles

  override val scale: Scale = Scale9

  override val label: String = "Woken up early"

  override val text: String = "How often have you woken up too early and not been able to get back to sleep?"
