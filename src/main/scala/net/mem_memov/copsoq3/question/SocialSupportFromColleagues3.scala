package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.SocialSupportFromColleagues
import net.mem_memov.copsoq3.scale.Scale1Dagger
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object SocialSupportFromColleagues3 extends Question:

  override val code: String = "SC3"

  override val level: Level = Level.Long

  override val dimension: Dimension = SocialSupportFromColleagues

  override val scale: Scale = Scale1Dagger

  override val label: String = "Colleagues listen to problems"

  override val text: String = "How often do your colleagues talk with you about how well you carry out your work?"
