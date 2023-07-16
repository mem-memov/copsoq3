package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.WorkLifeConflict
import net.mem_memov.copsoq3.scale.Scale2
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object WorkLifeConflict6 extends Question:

  override val code: String = "WF6"

  override val level: Level = Level.Long

  override val dimension: Dimension = WorkLifeConflict

  override val scale: Scale = Scale2

  override val label: String = "Change plans"

  override val text: String = "Due to work-related duties, I have to make changes to my plans for private and family activities."
