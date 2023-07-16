package net.mem_memov.copsoq3.value

import net.mem_memov.copsoq3.Value

case class MultipleChoiceOfFour(options: (Boolean, Boolean, Boolean, Boolean)) extends Value:

  def withFirst: MultipleChoiceOfFour = MultipleChoiceOfFour(options.copy(_1 = true))
  def withSecond: MultipleChoiceOfFour = MultipleChoiceOfFour(options.copy(_2 = true))
  def withThird: MultipleChoiceOfFour = MultipleChoiceOfFour(options.copy(_3 = true))
  def withFourth: MultipleChoiceOfFour = MultipleChoiceOfFour(options.copy(_4 = true))

object MultipleChoiceOfFour:

  val withoutAnySelection: MultipleChoiceOfFour = MultipleChoiceOfFour((false, false, false, false))


