package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.SocialSupportFromColleagues
import net.mem_memov.copsoq3.scale.Scale1Dagger
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object SocialSupportFromColleagues2 extends Question:

  override val code: String = "SCX2"

  override val level: Level = Level.Middle

  override val dimension: Dimension = SocialSupportFromColleagues

  override val scale: Scale = Scale1Dagger

  override val label: String = "Colleagues listen to problems"

  override val text: String = "How often are your colleagues willing to listen to your problems at work, if needed?"
