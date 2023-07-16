package net.mem_memov.copsoq3.dimension

import net.mem_memov.copsoq3.{Dimension, Section}
import net.mem_memov.copsoq3.section.Health

object Stress extends Dimension:

  override val code: String = "ST"

  override val sectionOption: Option[Section] = Some(Health)

  override val titleOption: Option[String] = Some("These questions are about how you have been during the last 4 weeks.")

