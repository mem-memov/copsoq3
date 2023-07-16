package net.mem_memov.copsoq3.scale

import net.mem_memov.copsoq3.Scale
import net.mem_memov.copsoq3.Value
import net.mem_memov.copsoq3.value.ZeroToHundred

object Scale3 extends Scale:

  override val code: String = "3"

  override def evaluate(value: String): Option[Value] =

    value.trim.toLowerCase match
      case "никогда" => Some(ZeroToHundred(0))
      case "редко" => Some(ZeroToHundred(25))
      case "иногда" => Some(ZeroToHundred(50))
      case "часто" => Some(ZeroToHundred(75))
      case "всегда" => Some(ZeroToHundred(0))
      case _ => None
