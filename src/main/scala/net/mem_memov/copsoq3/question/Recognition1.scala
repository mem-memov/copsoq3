package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.Recognition
import net.mem_memov.copsoq3.scale.Scale2
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object Recognition1 extends Question:

  override val code: String = "RE1"

  override val level: Level = Level.Core

  override val dimension: Dimension = Recognition

  override val scale: Scale = Scale2

  override val label: String = "Recognized by management"

  override val text: String = "Is your work recognized and appreciated by the management?"
