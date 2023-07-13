import net.mem_memov.copsoq3.Menu
import net.mem_memov.copsoq3.Survey

@main
def main: Unit =
  println("Copenhagen Psychosocial Questionnaire")
  Menu.show
  Menu.select(Survey.empty)



