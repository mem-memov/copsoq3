package net.mem_memov.copsoq3.scale

import net.mem_memov.copsoq3.Scale

object Scale1Dagger extends Scale:

  override def evaluate(value: String): Option[Int] =

    value.trim.toLowerCase match
      case "always" | "всегда" => Some(100)
      case "often" | "часто" => Some(75)
      case "sometimes" | "иногда" => Some(50)
      case "seldom" | "редко" => Some(25)
      case "никогда/крайне редко" => Some(0)
      case "у меня нет руководителя" => None
      case _ => None
