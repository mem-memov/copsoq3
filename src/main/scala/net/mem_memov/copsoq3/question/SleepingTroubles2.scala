package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.SleepingTroubles
import net.mem_memov.copsoq3.scale.Scale9
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object SleepingTroubles2 extends Question:

  override val code: String = "SL2"

  override val level: Level = Level.Long

  override val dimension: Dimension = SleepingTroubles

  override val scale: Scale = Scale9

  override val label: String = "Hard to sleep"

  override val text: String = "How often have you found it hard to go to sleep?"
