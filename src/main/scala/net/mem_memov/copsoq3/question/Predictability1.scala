package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.Predictability
import net.mem_memov.copsoq3.scale.Scale2
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object Predictability1 extends Question:

  override val code: String = "PR1"

  override val level: Level = Level.Core

  override val dimension: Dimension = Predictability

  override val scale: Scale = Scale2

  override val label: String = "Informed about changes"

  override val text: String = "At your place of work, are you informed well in advance concerning for example important decisions, changes or plans for the future?"
