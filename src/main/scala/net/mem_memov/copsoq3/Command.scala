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
    val name: String = "выйти"
    val description: String = "осуществляет выход из программы"

  object Load extends Command:
    import net.mem_memov.copsoq3.operation.Load as LoadOperation
    override def toOperation: Operation = LoadOperation(Load)
    val name: String = "загрузить"
    val description: String = "загружает файл с данными"

  object Save extends Command:
    import net.mem_memov.copsoq3.operation.Save as ExportOperation
    override def toOperation: Operation = ExportOperation(Save)
    val name: String = "выгрузить"
    val description: String = "выгружает данные в файл"

  def apply(name: String): Command =
    name match
      case Exit.name => Exit
      case Load.name => Load
      case Save.name => Save
      case _ => Unknown(name)