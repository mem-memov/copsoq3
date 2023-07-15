package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.SocialSupportFromSupervisor
import net.mem_memov.copsoq3.scale.Scale1Dagger
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object SocialSupportFromSupervisor3 extends Question:

  override val code: String = "SSX3"

  override val level: Level = Level.Long

  override val dimension: Dimension = SocialSupportFromSupervisor

  override val scale: Scale = Scale1Dagger

  override val label: String = "Supervisor talks about performance"

  override val text: String = "How often does your immediate superior talk with you about how well you carry out your work?"
