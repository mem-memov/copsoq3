package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.InfluenceAtWork
import net.mem_memov.copsoq3.scale.Scale2
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object PossibilitiesForDevelopment3 extends Question:

  override val code: String = "PD3"

  override val level: Level = Level.Core

  override val dimension: Dimension = InfluenceAtWork

  override val scale: Scale = Scale2

  override val label: String = "Use skills"

  override val text: String = "Can you use your skills or expertise in your work?"
