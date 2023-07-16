package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.GossipAndSlander
import net.mem_memov.copsoq3.scale.Scale4
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object GossipAndSlander1 extends Question:

  override val code: String = "GS1"

  override val level: Level = Level.Long

  override val dimension: Dimension = GossipAndSlander

  override val scale: Scale = Scale4

  override val label: String = "Emotionally demanding"

  override val text: String = "Have you been exposed to gossip and slander at your workplace during the last 12 months?"
