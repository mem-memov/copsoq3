package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.Recognition
import net.mem_memov.copsoq3.scale.Scale2
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object Recognition2 extends Question:

  override val code: String = "RE2"

  override val level: Level = Level.Long

  override val dimension: Dimension = Recognition

  override val scale: Scale = Scale2

  override val label: String = "Respected by management"

  override val text: String = "Does the management at your workplace respect you?"
