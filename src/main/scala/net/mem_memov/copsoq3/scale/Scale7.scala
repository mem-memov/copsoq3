package net.mem_memov.copsoq3.scale

import net.mem_memov.copsoq3.Scale

object Scale7 extends Scale:

  override def evaluate(value: String): Option[Int] =

    value.trim.toLowerCase match
      case "отличное" => Some(100)
      case "очень хорошее" => Some(75)
      case "хорошее" => Some(50)
      case "удовлетворительное" => Some(25)
      case "плохое" => Some(0)
      case _ => None
