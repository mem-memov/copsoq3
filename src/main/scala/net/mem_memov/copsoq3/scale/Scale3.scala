package net.mem_memov.copsoq3.scale

import net.mem_memov.copsoq3.{Question, Scale, Value}
import net.mem_memov.copsoq3.value.ZeroToHundred

object Scale3 extends Scale:

  override val code: String = "3"

  override def evaluate(value: String, question: Question, rowIndex: Int): Option[Value] =

    Scale.prepareValue(value) match
      case "never" | "никогда" => Some(ZeroToHundred(0))
      case "seldom" | "редко" => Some(ZeroToHundred(25))
      case "sometimes" | "иногда" => Some(ZeroToHundred(50))
      case "often" | "часто" => Some(ZeroToHundred(75))
      case "always" | "всегда" => Some(ZeroToHundred(0))
      case other =>
        reportUnexpectedValue(other, question, rowIndex)
        None
