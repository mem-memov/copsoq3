import scala.annotation.tailrec

@main
def main: Unit =
  showMenu
  

@tailrec
def showMenu: Unit =
  val command = io.StdIn.readLine("Введите команду: ")
  println("Hello world!")
  println(command)
  if command == "выход" then
    ()
  else
    showMenu
