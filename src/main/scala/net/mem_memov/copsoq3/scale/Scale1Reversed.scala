package net.mem_memov.copsoq3.scale

import net.mem_memov.copsoq3.Scale

object Scale1Reversed extends Scale:

  override def evaluate(value: String): Option[Int] =

    value.trim.toLowerCase match
      case "always" | "всегда" => Some(0)
      case "often" | "часто" => Some(25)
      case "sometimes" | "иногда" => Some(50)
      case "seldom" | "редко" => Some(75)
      case "никогда/крайне редко" => Some(100)
      case _ => None
