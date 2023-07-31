package net.mem_memov.copsoq3.scale

import net.mem_memov.copsoq3.{Question, Scale, Value}
import net.mem_memov.copsoq3.value.MultipleChoiceOfFour

object Scale5Multiple extends Scale:

  override val code: String = "5M"

  override def evaluate(value: String, question: Question, rowIndex: Int): Option[Value] =
 
    val indices = value.split(",").map(_.trim)
    
    if indices.isEmpty then
      Some(MultipleChoiceOfFour.withoutAnySelection)
    else
      val multipleChoiceOfFour = indices.foldLeft(MultipleChoiceOfFour.withoutAnySelection) { (choice, index) =>
        index match
          case "1" => choice.withFirst
          case "2" => choice.withSecond
          case "3" => choice.withThird
          case "4" => choice.withFourth
          case other =>
            reportUnexpectedValue(other, question, rowIndex)
            choice
      }
      Some(multipleChoiceOfFour)
    
    
