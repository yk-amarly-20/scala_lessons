// ひし形継承問題

trait TraitA {
  def greet(): Unit
}

trait TraitB extends TraitA {
  def greet(): Unit = println("Good morning")
}

trait TraitC extends TraitA {
  def greet(): Unit = println("Good evening")
}

// class ClassA extends TraitB with TraitC
// これはだめ
// どっちのgreetを使えばいいのかわからんくなる　

class ClassA extends TraitB with TraitC {
  override def greet(): Unit = println("HELLO!")
}

object Pra10 {
  def main(args: Array[String]) {
    val cls = new ClassA()
    cls.greet()
  }
}
