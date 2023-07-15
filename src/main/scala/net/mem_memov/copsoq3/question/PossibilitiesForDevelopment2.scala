package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.InfluenceAtWork
import net.mem_memov.copsoq3.scale.Scale2
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object PossibilitiesForDevelopment2 extends Question:

  override val code: String = "PD2"

  override val level: Level = Level.Core

  override val dimension: Dimension = InfluenceAtWork

  override val scale: Scale = Scale2

  override val label: String = "Learning new things"

  override val text: String = "Do you have the possibility of learning new things through your work?"
