// トレイとの初期化は、スーパークラスから初期化される
// lazy valで、実際に使われるとこまで初期化を遅らせることができる

trait A {
  val foo: String
}

trait B extends A {
  lazy val bar = foo + "World"
}

class C extends B {
  val foo = "Hello"

  def printBar(): Unit = println(bar)
}

object Pra14 {
  def main(args: Array[String]) {
    val cls = new C()
    cls.printBar()
  }
}
