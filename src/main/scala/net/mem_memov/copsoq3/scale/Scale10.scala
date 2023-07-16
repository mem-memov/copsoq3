package net.mem_memov.copsoq3.scale

import net.mem_memov.copsoq3.Scale
import net.mem_memov.copsoq3.Value
import net.mem_memov.copsoq3.value.ZeroToHundred

object Scale10 extends Scale:

  override val code: String = "10"

  override def evaluate(value: String): Option[Value] =

    value.trim.toLowerCase match
      case "идеально" => Some(ZeroToHundred(100))
      case "достаточно хорошо" => Some(ZeroToHundred(67))
      case "немного" => Some(ZeroToHundred(33))
      case "не подходят" => Some(ZeroToHundred(0))
      case _ => None
