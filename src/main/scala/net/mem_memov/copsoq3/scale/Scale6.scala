package net.mem_memov.copsoq3.scale

import net.mem_memov.copsoq3.Scale

object Scale6 extends Scale:

  override def evaluate(value: String): Option[Int] =

    value.trim.toLowerCase match
      case "весьма удовлетворен" => Some(100)
      case "удовлетворен" => Some(75)
      case "затрудняюсь ответить" => Some(50)
      case "не удовлетворен" => Some(25)
      case "весьма не удовлетворен" => Some(0)
      case _ => None
