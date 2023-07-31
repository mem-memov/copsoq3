package net.mem_memov.copsoq3.scale

import net.mem_memov.copsoq3.{Question, Scale, Value}
import net.mem_memov.copsoq3.value.ZeroToHundred

object Scale1Dagger extends Scale:

  override val code: String = "1†"

  override def evaluate(value: String, question: Question, rowIndex: Int): Option[Value] =

    Scale.prepareValue(value) match
      case "always" | "всегда" => Some(ZeroToHundred(100))
      case "often" | "часто" => Some(ZeroToHundred(75))
      case "sometimes" | "иногда" => Some(ZeroToHundred(50))
      case "seldom" | "редко" => Some(ZeroToHundred(25))
      case "never/hardly ever" | "никогда/крайне редко" => Some(ZeroToHundred(0))
      case "i do not have a supervisor" | "у меня нет руководителя" => None
      case other =>
        reportUnexpectedValue(other, question, rowIndex)
        None
