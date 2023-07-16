package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.CognitiveStress
import net.mem_memov.copsoq3.scale.Scale9
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object CognitiveStress1 extends Question:

  override val code: String = "CS1"

  override val level: Level = Level.Long

  override val dimension: Dimension = CognitiveStress

  override val scale: Scale = Scale9

  override val label: String = "Problems concentrating"

  override val text: String = "How often have you had problems concentrating?"
