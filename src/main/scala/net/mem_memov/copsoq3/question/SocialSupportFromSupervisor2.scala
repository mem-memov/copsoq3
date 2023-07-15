package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.SocialSupportFromSupervisor
import net.mem_memov.copsoq3.scale.Scale1Dagger
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object SocialSupportFromSupervisor2 extends Question:

  override val code: String = "SSX2"

  override val level: Level = Level.Core

  override val dimension: Dimension = SocialSupportFromSupervisor

  override val scale: Scale = Scale1Dagger

  override val label: String = "Support supervisor"

  override val text: String = "How often do you get help and support from your immediate superior, if needed?"
