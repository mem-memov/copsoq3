package net.mem_memov.copsoq3.scale

import net.mem_memov.copsoq3.{Question, Scale, Value}
import net.mem_memov.copsoq3.value.ZeroToHundred

object Scale6 extends Scale:

  override val code: String = "6"

  override def evaluate(value: String, question: Question, rowIndex: Int): Option[Value] =

    Scale.prepareValue(value) match
      case "very satisfied" | "весьма удовлетворен" => Some(ZeroToHundred(100))
      case "satisfied" | "удовлетворен" => Some(ZeroToHundred(75))
      case "neither/nor" | "затрудняюсь ответить" => Some(ZeroToHundred(50))
      case "unsatisfied" | "не удовлетворен" => Some(ZeroToHundred(25))
      case "very unsatisfied" | "весьма не удовлетворен" => Some(ZeroToHundred(0))
      case other =>
        reportUnexpectedValue(other, question, rowIndex)
        None
