package net.mem_memov.copsoq3.dimension

import net.mem_memov.copsoq3.{Dimension, Section}
import net.mem_memov.copsoq3.section.TrustAndJustice

object OrganizationalJustice extends Dimension:

  override val code: String = "JU"

  override val sectionOption: Option[Section] = Some(TrustAndJustice)
