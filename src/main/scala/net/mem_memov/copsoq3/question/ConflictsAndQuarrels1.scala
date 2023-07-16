package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.ConflictsAndQuarrels
import net.mem_memov.copsoq3.scale.Scale4
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object ConflictsAndQuarrels1 extends Question:

  override val code: String = "CQ1"

  override val level: Level = Level.Long

  override val dimension: Dimension = ConflictsAndQuarrels

  override val scale: Scale = Scale4

  override val label: String = "Conflicts and quarrels"

  override val text: String = "Have you been involved in quarrels or conflicts at your workplace during the last 12 months?"
