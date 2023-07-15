package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.Predictability
import net.mem_memov.copsoq3.scale.Scale2
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object Predictability2 extends Question:

  override val code: String = "PR2"

  override val level: Level = Level.Core

  override val dimension: Dimension = Predictability

  override val scale: Scale = Scale2

  override val label: String = "Information to work well"

  override val text: String = "Do you receive all the information you need in order to do your work well?"
