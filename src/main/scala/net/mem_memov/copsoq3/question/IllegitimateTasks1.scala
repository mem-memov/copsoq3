package net.mem_memov.copsoq3.question

import net.mem_memov.copsoq3.dimension.IllegitimateTasks
import net.mem_memov.copsoq3.scale.Scale2
import net.mem_memov.copsoq3.{Dimension, Level, Question, Scale}

object IllegitimateTasks1 extends Question:

  override val code: String = "IT1"

  override val level: Level = Level.Middle

  override val dimension: Dimension = IllegitimateTasks

  override val scale: Scale = Scale2

  override val label: String = "Unnecessary tasks"

  override val text: String = "Do you sometimes have to do things which seem to be unnecessary?"
