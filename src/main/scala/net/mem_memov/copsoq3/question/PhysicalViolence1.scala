package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.PhysicalViolence
import net.mem_memov.copsoq3.scale.Scale4
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object PhysicalViolence1 extends Question:

  override val code: String = "PV1"

  override val level: Level = Level.Long

  override val dimension: Dimension = PhysicalViolence

  override val scale: Scale = Scale4

  override val label: String = "Physical violence"

  override val text: String = "Have you been exposed to physical violence at your workplace during the last 12 months?"
