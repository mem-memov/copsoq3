package net.mem_memov.copsoq3.scale

import net.mem_memov.copsoq3.Scale

object Scale9 extends Scale:

  override def evaluate(value: String): Option[Int] =

    value.trim.toLowerCase match
      case "всё время" => Some(100)
      case "значительную часть времени" => Some(75)
      case "часть времени" => Some(50)
      case "незначительную часть времени" => Some(25)
      case "никогда" => Some(0)
      case _ => None
