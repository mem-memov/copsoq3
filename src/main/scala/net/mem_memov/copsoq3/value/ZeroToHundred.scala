package net.mem_memov.copsoq3.value

import net.mem_memov.copsoq3.Value

case class ZeroToHundred(number: Int) extends Value:
  
  require(number >= 0 && number <= 100)

