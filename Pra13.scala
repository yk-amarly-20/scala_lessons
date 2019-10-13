trait TraitA {
  def greet(): Unit = println("Hello!")
}

trait TraitB extends TraitA {
  override def greet(): Unit = {
    super.greet()
    println("My name is Kojima")
  }
}

trait TraitC extends TraitA {
  override def greet(): Unit = {
    super.greet()
    println("I like natto")
  }
}

class ClassA extends TraitB with TraitC
class ClassB extends TraitC with TraitB

object Pra13 {
  def main(args: Array[String]) {
    val clsA = new ClassA()
    clsA.greet()
    val clsB = new ClassB()
    clsB.greet()
  }
}
