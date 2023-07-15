package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.SocialSupportFromColleagues
import net.mem_memov.copsoq3.scale.Scale1Dagger
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object SocialSupportFromColleagues1 extends Question:

  override val code: String = "SCX1"

  override val level: Level = Level.Core

  override val dimension: Dimension = SocialSupportFromColleagues

  override val scale: Scale = Scale1Dagger

  override val label: String = "Support colleagues"

  override val text: String = "How often do you get help and support from your colleagues, if needed?"
