// 線形化

trait TraitA {
  def greet(): Unit
}

trait TraitB extends TraitA {
  override def greet(): Unit = println("Good morning")
}

trait TraitC extends TraitA {
  override def greet(): Unit = println("Good evening")
}

class ClassA extends TraitB with TraitC

// それぞれのtraitにoverrideをつけた場合、後に継承したものが優先される
