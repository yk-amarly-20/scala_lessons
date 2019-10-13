// トレイト

trait TraitA {
  val name: String
  def printName(): Unit = println(name)
}

class ClassA(val name: String) extends TraitA

object ClassA {
  val a = new ClassA("名前")

  val a2 = new TraitA { val name = "kojima" }
}

object Pra9 {
  def main(args: Array[String]): Unit = {
    println(ClassA.a.name)
  }
}
