package net.mem_memov.copsoq3.dimension

import net.mem_memov.copsoq3.{Dimension, Section}
import net.mem_memov.copsoq3.section.Health

object SelfRatedHealth extends Dimension:

  override val code: String = "GH"

  override val sectionOption: Option[Section] = Some(Health)
