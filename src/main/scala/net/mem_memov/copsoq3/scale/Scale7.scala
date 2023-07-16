package net.mem_memov.copsoq3.scale

import net.mem_memov.copsoq3.Scale
import net.mem_memov.copsoq3.Value
import net.mem_memov.copsoq3.value.ZeroToHundred

object Scale7 extends Scale:

  override val code: String = "7"

  override def evaluate(value: String): Option[Value] =

    value.trim.toLowerCase match
      case "отличное" => Some(ZeroToHundred(100))
      case "очень хорошее" => Some(ZeroToHundred(75))
      case "хорошее" => Some(ZeroToHundred(50))
      case "удовлетворительное" => Some(ZeroToHundred(25))
      case "плохое" => Some(ZeroToHundred(0))
      case _ => None
