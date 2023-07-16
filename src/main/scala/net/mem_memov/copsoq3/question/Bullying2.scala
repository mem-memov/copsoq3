package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.Bullying
import net.mem_memov.copsoq3.scale.Scale1SectionSign
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object Bullying2 extends Question:

  override val code: String = "BU2"

  override val level: Level = Level.Long

  override val dimension: Dimension = Bullying

  override val scale: Scale = Scale1SectionSign

  override val label: String = "Unjustly criticized, bullied, shown up"

  override val text: String = "How often do you feel unjustly criticized, bullied or shown up in front of others by your colleagues or\nyour superior?"
