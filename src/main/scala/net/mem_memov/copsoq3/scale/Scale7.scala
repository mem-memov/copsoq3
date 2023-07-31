package net.mem_memov.copsoq3.scale

import net.mem_memov.copsoq3.Scale
import net.mem_memov.copsoq3.Value
import net.mem_memov.copsoq3.value.ZeroToHundred

object Scale7 extends Scale:

  override val code: String = "7"

  override def evaluate(value: String): Option[Value] =

    Scale.prepareValue(value) match
      case "excellent" | "отличное" => Some(ZeroToHundred(100))
      case "very good" | "очень хорошее" => Some(ZeroToHundred(75))
      case "good" | "хорошее" => Some(ZeroToHundred(50))
      case "fair" | "удовлетворительное" => Some(ZeroToHundred(25))
      case "poor" | "плохое" => Some(ZeroToHundred(0))
      case _ => None
