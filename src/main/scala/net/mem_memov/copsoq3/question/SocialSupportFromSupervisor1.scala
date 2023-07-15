package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.SocialSupportFromSupervisor
import net.mem_memov.copsoq3.scale.Scale1Dagger
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object SocialSupportFromSupervisor1 extends Question:

  override val code: String = "SSX1"

  override val level: Level = Level.Middle

  override val dimension: Dimension = SocialSupportFromSupervisor

  override val scale: Scale = Scale1Dagger

  override val label: String = "Supervisor listens to problems"

  override val text: String = "How often is your immediate superior willing to listen to your problems at work, if needed?"
