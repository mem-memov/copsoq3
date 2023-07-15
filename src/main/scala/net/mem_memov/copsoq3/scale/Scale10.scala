package net.mem_memov.copsoq3.scale

import net.mem_memov.copsoq3.Scale

object Scale10 extends Scale:

  override def evaluate(value: String): Option[Int] =

    value.trim.toLowerCase match
      case "идеально" => Some(100)
      case "достаточно хорошо" => Some(67)
      case "немного" => Some(33)
      case "не подходят" => Some(0)
      case _ => None
