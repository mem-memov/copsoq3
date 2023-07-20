package net.mem_memov.copsoq3.value

import net.mem_memov.copsoq3.Value

case class SingleChoiceOfFive(options: (Boolean, Boolean, Boolean, Boolean, Boolean)) extends Value:

  private val optionList = List(options._1, options._2, options._3, options._4, options._5)
  require(optionList.map(b => if b then 1 else 0).sum == 1)

  override def toString: String =

    this match
      case SingleChoiceOfFive.first => "1"
      case SingleChoiceOfFive.second => "2"
      case SingleChoiceOfFive.third => "3"
      case SingleChoiceOfFive.fourth => "4"
      case SingleChoiceOfFive.fifth => "5"
      case _ => ""

object SingleChoiceOfFive:

  val first: SingleChoiceOfFive = SingleChoiceOfFive((true, false, false, false, false))
  val second: SingleChoiceOfFive = SingleChoiceOfFive((false, true, false, false, false))
  val third: SingleChoiceOfFive = SingleChoiceOfFive((false, false, true, false, false))
  val fourth: SingleChoiceOfFive = SingleChoiceOfFive((false, false, false, true, false))
  val fifth: SingleChoiceOfFive = SingleChoiceOfFive((false, false, false, false, true))
