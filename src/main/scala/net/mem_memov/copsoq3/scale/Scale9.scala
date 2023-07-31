package net.mem_memov.copsoq3.scale

import net.mem_memov.copsoq3.Scale
import net.mem_memov.copsoq3.Value
import net.mem_memov.copsoq3.value.ZeroToHundred

object Scale9 extends Scale:

  override val code: String = "9"

  override def evaluate(value: String): Option[Value] =

    Scale.prepareValue(value) match
      case "all the time" | "всё время" => Some(ZeroToHundred(100))
      case "a large part of the time" | "значительную часть времени" => Some(ZeroToHundred(75))
      case "part of the time" | "часть времени" => Some(ZeroToHundred(50))
      case "a small part of the time" | "незначительную часть времени" => Some(ZeroToHundred(25))
      case "not at all" | "никогда" => Some(ZeroToHundred(0))
      case _ => None
