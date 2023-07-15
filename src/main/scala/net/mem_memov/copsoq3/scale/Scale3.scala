package net.mem_memov.copsoq3.scale

import net.mem_memov.copsoq3.Scale

object Scale3 extends Scale:

  override def evaluate(value: String): Option[Int] =

    value.trim.toLowerCase match
      case "никогда" => Some(0)
      case "редко" => Some(25)
      case "иногда" => Some(50)
      case "часто" => Some(75)
      case "всегда" => Some(0)
      case _ => None
