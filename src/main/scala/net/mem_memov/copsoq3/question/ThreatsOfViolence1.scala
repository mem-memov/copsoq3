package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.ThreatsOfViolence
import net.mem_memov.copsoq3.scale.Scale4
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object ThreatsOfViolence1 extends Question:

  override val code: String = "TV1"

  override val level: Level = Level.Long

  override val dimension: Dimension = ThreatsOfViolence

  override val scale: Scale = Scale4

  override val label: String = "Threats of violence"

  override val text: String = "Have you been exposed to threats of violence at your workplace during the last 12 months?"
