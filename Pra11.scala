trait TraitA {
  def greet(): Unit
}

trait TraitB extends TraitA {
  def greet(): Unit = println("Good morning")
}

trait TraitC extends TraitA {
  def greet(): Unit = println("Good evening")
}

class ClassA extends TraitB with TraitC {
  override def greet(): Unit = {
    super[TraitB].greet()
    super[TraitC].greet()
  }
}

object Pra11 {
  def main(args: Array[String]) {
    val cls = new ClassA()
    cls.greet()
  }
}
