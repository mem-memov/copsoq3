package net.mem_memov.copsoq3.scale

import net.mem_memov.copsoq3.Scale
import net.mem_memov.copsoq3.Value
import net.mem_memov.copsoq3.value.ZeroToHundred

object Scale10 extends Scale:

  override val code: String = "10"

  override def evaluate(value: String): Option[Value] =

    Scale.prepareValue(value) match
      case "fits perfectly" | "идеально" => Some(ZeroToHundred(100))
      case "fits quite well" | "достаточно хорошо" => Some(ZeroToHundred(67))
      case "fits a little bit" | "немного" => Some(ZeroToHundred(33))
      case "does not fit" | "не подходят" => Some(ZeroToHundred(0))
      case other =>
        reportUnexpectedValue(other)
        None
