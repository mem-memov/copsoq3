package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.Recognition
import net.mem_memov.copsoq3.scale.Scale2
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object Recognition3 extends Question:

  override val code: String = "RE3"

  override val level: Level = Level.Long

  override val dimension: Dimension = Recognition

  override val scale: Scale = Scale2

  override val label: String = "Treated fairly"

  override val text: String = "Are you treated fairly at your workplace?"
