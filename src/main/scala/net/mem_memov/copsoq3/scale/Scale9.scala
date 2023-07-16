package net.mem_memov.copsoq3.scale

import net.mem_memov.copsoq3.Scale
import net.mem_memov.copsoq3.Value
import net.mem_memov.copsoq3.value.ZeroToHundred

object Scale9 extends Scale:

  override val code: String = "9"

  override def evaluate(value: String): Option[Value] =

    value.trim.toLowerCase match
      case "всё время" => Some(ZeroToHundred(100))
      case "значительную часть времени" => Some(ZeroToHundred(75))
      case "часть времени" => Some(ZeroToHundred(50))
      case "незначительную часть времени" => Some(ZeroToHundred(25))
      case "никогда" => Some(ZeroToHundred(0))
      case _ => None
