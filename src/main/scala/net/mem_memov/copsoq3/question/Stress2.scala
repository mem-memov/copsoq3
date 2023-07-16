package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.Stress
import net.mem_memov.copsoq3.scale.Scale9
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object Stress2 extends Question:

  override val code: String = "ST2"

  override val level: Level = Level.Long

  override val dimension: Dimension = Stress

  override val scale: Scale = Scale9

  override val label: String = "Irritable"

  override val text: String = "How often have you been irritable?"
