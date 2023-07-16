package net.mem_memov.copsoq3.scale

import net.mem_memov.copsoq3.Scale
import net.mem_memov.copsoq3.Value
import net.mem_memov.copsoq3.value.ZeroToHundred

object Scale6 extends Scale:

  override def evaluate(value: String): Option[Value] =

    value.trim.toLowerCase match
      case "весьма удовлетворен" => Some(ZeroToHundred(100))
      case "удовлетворен" => Some(ZeroToHundred(75))
      case "затрудняюсь ответить" => Some(ZeroToHundred(50))
      case "не удовлетворен" => Some(ZeroToHundred(25))
      case "весьма не удовлетворен" => Some(ZeroToHundred(0))
      case _ => None
