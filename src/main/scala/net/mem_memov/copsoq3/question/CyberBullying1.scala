package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.CyberBullying
import net.mem_memov.copsoq3.scale.Scale4
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object CyberBullying1 extends Question:

  override val code: String = "HSM1"

  override val level: Level = Level.Long

  override val dimension: Dimension = CyberBullying

  override val scale: Scale = Scale4

  override val label: String = "Cyber bullying"

  override val text: String = "Have you been exposed to work-related harassment on the social media (e.g. Facebook), by e-mail or text messages during the last 12 months?"
