package net.mem_memov.copsoq3.scale

import net.mem_memov.copsoq3.Scale
import net.mem_memov.copsoq3.Value
import net.mem_memov.copsoq3.value.SingleChoiceOfFive

object Scale4 extends Scale:

  override val code: String = "4"

  override def evaluate(value: String): Option[Value] =

    value.trim.toLowerCase match
      case "Yes, daily" => Some(SingleChoiceOfFive.first)
      case "Yes, weekly" => Some(SingleChoiceOfFive.second)
      case "Yes, monthly" => Some(SingleChoiceOfFive.third)
      case "Yes, a few times" => Some(SingleChoiceOfFive.fourth)
      case "No" => Some(SingleChoiceOfFive.fifth)
      case _ => None
