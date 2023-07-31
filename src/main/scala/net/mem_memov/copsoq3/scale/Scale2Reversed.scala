package net.mem_memov.copsoq3.scale

import net.mem_memov.copsoq3.Scale
import net.mem_memov.copsoq3.Value
import net.mem_memov.copsoq3.value.ZeroToHundred

object Scale2Reversed extends Scale:

  override val code: String = "2R"

  override def evaluate(value: String): Option[Value] =

    Scale.prepareValue(value) match
      case "to a very large extent" | "в весьма значительной степени" => Some(ZeroToHundred(0))
      case "to a large extent" | "в значительной степени" => Some(ZeroToHundred(25))
      case "somewhat" | "в некоторой степени" => Some(ZeroToHundred(50))
      case "to a small extent" | "в незначительной степени" => Some(ZeroToHundred(75))
      case "to a very small extent" | "в весьма незначительной степени" => Some(ZeroToHundred(100))
      case _ => None
