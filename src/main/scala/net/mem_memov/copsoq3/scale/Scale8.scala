package net.mem_memov.copsoq3.scale

import net.mem_memov.copsoq3.Scale
import net.mem_memov.copsoq3.Value
import net.mem_memov.copsoq3.value.ZeroToHundred

object Scale8 extends Scale:

  override def evaluate(value: String): Option[Value] =

    value.trim.toLowerCase match
      case "0" => ZeroToHundred(0)
      case "10" => ZeroToHundred(10)
      case "20" => ZeroToHundred(20)
      case "30" => ZeroToHundred(30)
      case "40" => ZeroToHundred(40)
      case "50" => ZeroToHundred(50)
      case "60" => ZeroToHundred(60)
      case "70" => ZeroToHundred(70)
      case "80" => ZeroToHundred(80)
      case "90" => ZeroToHundred(90)
      case "100" => ZeroToHundred(100)
      case _ => None
