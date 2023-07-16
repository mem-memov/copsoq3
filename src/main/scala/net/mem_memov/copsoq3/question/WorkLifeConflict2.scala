package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.WorkLifeConflict
import net.mem_memov.copsoq3.scale.Scale2
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object WorkLifeConflict2 extends Question:

  override val code: String = "WF2"

  override val level: Level = Level.Core

  override val dimension: Dimension = WorkLifeConflict

  override val scale: Scale = Scale2

  override val label: String = "Energy conflict"

  override val text: String = "Do you feel that your work drains so much of your energy that it has a negative effect on your private life?"
