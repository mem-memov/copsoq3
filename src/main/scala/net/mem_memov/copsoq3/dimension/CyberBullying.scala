package net.mem_memov.copsoq3.dimension

import net.mem_memov.copsoq3.{Dimension, Section}
import net.mem_memov.copsoq3.section.NegativeActs

object CyberBullying extends Dimension:

  override val code: String = "HSM"

  override val sectionOption: Option[Section] = Some(NegativeActs)
