package net.mem_memov.copsoq3.value

import net.mem_memov.copsoq3.Value

case class MultipleChoiceOfFour(options: (Boolean, Boolean, Boolean, Boolean)) extends Value:

  def withFirst: MultipleChoiceOfFour = MultipleChoiceOfFour(options.copy(_1 = true))
  def withSecond: MultipleChoiceOfFour = MultipleChoiceOfFour(options.copy(_2 = true))
  def withThird: MultipleChoiceOfFour = MultipleChoiceOfFour(options.copy(_3 = true))
  def withFourth: MultipleChoiceOfFour = MultipleChoiceOfFour(options.copy(_4 = true))

  override def toString: String =

    val map = Map(
      1 -> options._1,
      2 -> options._2,
      3 -> options._3,
      4 -> options._4
    )

    map.filter((index, flag) => flag).keys.map(_.toString).mkString(",")


object MultipleChoiceOfFour:

  val withoutAnySelection: MultipleChoiceOfFour = MultipleChoiceOfFour((false, false, false, false))


