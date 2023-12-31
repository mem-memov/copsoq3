package net.mem_memov.copsoq3.scale

import net.mem_memov.copsoq3.{Question, Scale, Value}
import net.mem_memov.copsoq3.value.ZeroToHundred

object Scale2Dagger extends Scale:

  override val code: String = "2†"

  override def evaluate(value: String, question: Question, rowIndex: Int): Option[Value] =

    Scale.prepareValue(value) match
      case "to a very large extent" | "в весьма значительной степени" => Some(ZeroToHundred(100))
      case "to a large extent" | "в значительной степени" => Some(ZeroToHundred(75))
      case "somewhat" | "в некоторой степени" => Some(ZeroToHundred(50))
      case "to a small extent" | "в незначительной степени" => Some(ZeroToHundred(25))
      case "to a very small extent" | "в весьма незначительной степени" => Some(ZeroToHundred(0))
      case "i do not have a supervisor" | "у меня нет руководителя" => None
      case other =>
        reportUnexpectedValue(other, question, rowIndex)
        None
