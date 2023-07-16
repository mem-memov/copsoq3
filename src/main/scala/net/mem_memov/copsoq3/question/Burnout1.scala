package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.Burnout
import net.mem_memov.copsoq3.scale.Scale9
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object Burnout1 extends Question:

  override val code: String = "BO1"

  override val level: Level = Level.Long

  override val dimension: Dimension = Burnout

  override val scale: Scale = Scale9

  override val label: String = "Worn out"

  override val text: String = "How often have you felt worn out?"
