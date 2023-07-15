package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.InfluenceAtWork
import net.mem_memov.copsoq3.scale.Scale2
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object PossibilitiesForDevelopment4 extends Question:

  override val code: String = "PD4"

  override val level: Level = Level.Middle

  override val dimension: Dimension = InfluenceAtWork

  override val scale: Scale = Scale2

  override val label: String = "Develop skills"

  override val text: String = "Does your work give you the opportunity to develop your skills?"
