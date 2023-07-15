package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.WorkPace
import net.mem_memov.copsoq3.scale.Scale2
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object WorkPace3 extends Question:

  override val code: String = "WP3"

  override val level: Level = Level.Long

  override val dimension: Dimension = WorkPace

  override val scale: Scale = Scale2

  override val label: String = "High pace necessary"

  override val text: String = "Is it necessary to keep working at a high pace?"

