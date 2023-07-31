package net.mem_memov.copsoq3.scale

import net.mem_memov.copsoq3.Scale
import net.mem_memov.copsoq3.Value
import net.mem_memov.copsoq3.value.ZeroToHundred

object Scale1DoubleDagger extends Scale:

  override val code: String = "1‡"

  override def evaluate(value: String): Option[Value] =

    Scale.prepareValue(value) match
      case "always" | "всегда" => Some(ZeroToHundred(100))
      case "often" | "часто" => Some(ZeroToHundred(75))
      case "sometimes" | "иногда" => Some(ZeroToHundred(50))
      case "seldom" | "редко" => Some(ZeroToHundred(25))
      case "never/hardly ever" | "никогда/крайне редко" => Some(ZeroToHundred(0))
      case "i do not have colleagues" | "у меня нет коллег" => None
      case _ => None
