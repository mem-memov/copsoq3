package net.mem_memov.copsoq3.scale

import net.mem_memov.copsoq3.Scale
import net.mem_memov.copsoq3.Value
import net.mem_memov.copsoq3.value.SingleChoiceOfFive

object Scale4 extends Scale:

  override val code: String = "4"

  override def evaluate(value: String): Option[Value] =

    Scale.prepareValue(value) match
      case "yes, daily" | "да, ежедневно" => Some(SingleChoiceOfFive.first)
      case "yes, weekly" | "да, еженедельно" => Some(SingleChoiceOfFive.second)
      case "yes, monthly" | "да, ежемесячно" => Some(SingleChoiceOfFive.third)
      case "yes, a few times" | "да, несколько раз" => Some(SingleChoiceOfFive.fourth)
      case "no" | "нет" => Some(SingleChoiceOfFive.fifth)
      case _ => None
