package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.WorkPace
import net.mem_memov.copsoq3.scale.Scale1
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object WorkPace1 extends Question:

  override val code: String = "WP1"

  override val level: Level = Level.Core

  override val dimension: Dimension = WorkPace

  override val scale: Scale = Scale1

  override val label: String = "Work fast"

  override val text: String = "Do you have to work very fast?"

