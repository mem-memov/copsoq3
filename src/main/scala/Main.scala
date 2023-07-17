import net.mem_memov.copsoq3.Menu
import net.mem_memov.copsoq3.Survey

@main
def main: Unit =
//  net.mem_memov.copsoq3.QuestionEnumeration.values.map { el =>
//    println(el.getValue.code)
//  }
  println("Copenhagen Psychosocial Questionnaire")
  Menu.show
  Menu.select(Survey.empty)



