package net.mem_memov.copsoq3

trait Dimension:

  val code: String

  val titleOption: Option[String] = None

  val sectionOption: Option[Section] = None
