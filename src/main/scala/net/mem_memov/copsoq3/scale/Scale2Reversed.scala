package net.mem_memov.copsoq3.scale

import net.mem_memov.copsoq3.Scale
import net.mem_memov.copsoq3.Value
import net.mem_memov.copsoq3.value.ZeroToHundred

object Scale2Reversed extends Scale:

  override val code: String = "2R"

  override def evaluate(value: String): Option[Value] =

    value.trim.toLowerCase match
      case "в весьма значительной степени" => Some(ZeroToHundred(0))
      case "в значительной степени" => Some(ZeroToHundred(25))
      case "в некоторой степени" => Some(ZeroToHundred(50))
      case "в незначительной степени" => Some(ZeroToHundred(75))
      case "в весьма незначительной степени" => Some(ZeroToHundred(100))
      case _ => None
