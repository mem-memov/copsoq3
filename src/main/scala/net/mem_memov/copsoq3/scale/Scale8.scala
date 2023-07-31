package net.mem_memov.copsoq3.scale

import net.mem_memov.copsoq3.Scale
import net.mem_memov.copsoq3.Value
import net.mem_memov.copsoq3.value.ZeroToHundred

object Scale8 extends Scale:

  override val code: String = "8"

  override def evaluate(value: String): Option[Value] =

    Scale.prepareValue(value) match
      case "0" => Some(ZeroToHundred(0))
      case "10" => Some(ZeroToHundred(10))
      case "20" => Some(ZeroToHundred(20))
      case "30" => Some(ZeroToHundred(30))
      case "40" => Some(ZeroToHundred(40))
      case "50" => Some(ZeroToHundred(50))
      case "60" => Some(ZeroToHundred(60))
      case "70" => Some(ZeroToHundred(70))
      case "80" => Some(ZeroToHundred(80))
      case "90" => Some(ZeroToHundred(90))
      case "100" => Some(ZeroToHundred(100))
      case _ => None
