package net.mem_memov.copsoq3

sealed trait Command:

  def toOperation: Operation

object Command:

  case class Unknown(name: String) extends Command:
    import net.mem_memov.copsoq3.operation.Unknown as UnknownOperation
    override def toOperation: Operation = UnknownOperation(this)

  object Exit extends Command:
    import net.mem_memov.copsoq3.operation.Exit as ExitOperation
    override def toOperation: Operation = ExitOperation(Exit)

  object Load extends Command:
    import net.mem_memov.copsoq3.operation.Load as LoadOperation
    override def toOperation: Operation = LoadOperation(Load)

  def apply(name: String): Command =
    name match
      case "выйти" => Exit
      case "загрузить" => Load
      case _ => Unknown(name)