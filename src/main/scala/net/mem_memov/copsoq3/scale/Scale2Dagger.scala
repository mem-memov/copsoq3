package net.mem_memov.copsoq3.scale

import net.mem_memov.copsoq3.Scale

object Scale2Dagger extends Scale:

  override def evaluate(value: String): Option[Int] =

    value.trim.toLowerCase match
      case "в весьма значительной степени" => Some(100)
      case "в значительной степени" => Some(75)
      case "в некоторой степени" => Some(50)
      case "в незначительной степени" => Some(25)
      case "в весьма незначительной степени" => Some(0)
      case "у меня нет руководителя" => None
      case _ => None
