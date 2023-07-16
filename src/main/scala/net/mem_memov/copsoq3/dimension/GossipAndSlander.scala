package net.mem_memov.copsoq3.dimension

import net.mem_memov.copsoq3.{Dimension, Section}
import net.mem_memov.copsoq3.section.NegativeActs

object GossipAndSlander extends Dimension:

  override val code: String = "GS"

  override val sectionOption: Option[Section] = Some(NegativeActs)
