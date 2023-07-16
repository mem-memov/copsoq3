package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.ControlOverWorkingTime
import net.mem_memov.copsoq3.scale.Scale1
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object ControlOverWorkingTime3 extends Question:

  override val code: String = "CT3"

  override val level: Level = Level.Middle

  override val dimension: Dimension = ControlOverWorkingTime

  override val scale: Scale = Scale1

  override val label: String = "Chat with colleague"

  override val text: String = "Can you leave your work to have a chat with a colleague?"
