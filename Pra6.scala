object Pra6{
  def main(args:Array[String]): Unit ={
    var p1 = new Point(1, 1)
    var p2 = new Point(2, 2)
    var p3 = p1 + p2
    println(p3.x)

    val adder = new Adder()
    val fun: Int => Int = adder.add(2)(_)
    println(fun(3))
  }
}

class Point(val x: Int, val y: Int) {
  def +(p: Point): Point = {
    new Point(x + p.x, y + p.y)
  }
  override def toString(): String = "(" + x + ", " + y + ")"
}

class Adder {
  def add(x: Int)(y: Int): Int = x + y
}

class APrinter() {
  def print(): Unit = {
    println("A")
  }
}

class BPrinter() extends APrinter {
  override def print(): Unit = {
    println("B")
  }
}
