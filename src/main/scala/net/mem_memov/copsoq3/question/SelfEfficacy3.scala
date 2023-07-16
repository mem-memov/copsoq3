package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.SelfEfficacy
import net.mem_memov.copsoq3.scale.Scale10
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object SelfEfficacy3 extends Question:

  override val code: String = "SE3"

  override val level: Level = Level.Long

  override val dimension: Dimension = SelfEfficacy

  override val scale: Scale = Scale10

  override val label: String = "Reach objectives"

  override val text: String = "It is easy for me to stick to my plans and reach my objectives."
