package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.WorkPace
import net.mem_memov.copsoq3.scale.Scale2
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object WorkPace2 extends Question:

  override val code: String = "WP2"

  override val level: Level = Level.Core

  override val dimension: Dimension = WorkPace

  override val scale: Scale = Scale2

  override val label: String = "High pace"

  override val text: String = "Do you work at a high pace throughout the day?"

