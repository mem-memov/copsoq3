package net.mem_memov.copsoq3.dimension

import net.mem_memov.copsoq3.{Dimension, Section}
import net.mem_memov.copsoq3.section.NegativeActs

object PhysicalViolence extends Dimension:

  override val code: String = "PV"

  override val sectionOption: Option[Section] = Some(NegativeActs)
