class Cell[A](var value: A) {
  def put(newValue: A): Unit = {
    value = newValue
  }

  def get(): A = value
}

class Pair[A, B](val a: A, val b: B) {
  override def toString(): String = {
    "(" + a + "," + b + ")"
  }
}

object Pra15 {
  def main(args: Array[String]) {
    val cell = new Cell[Int](1)
    cell.put(2)
    val cell_num = cell.get()
    println(cell_num)
    val pair = divide(7, 3)
    println(pair)
  }

  def divide(m: Int, n: Int): Pair[Int, Int] = {
    new Pair[Int, Int](m / n, m % n)
  }
}
