// リストのソート

object Pra44 {
  def main(args: Array[String]): Unit = {
    val lstInt = List(1, 6, 3, 4, 0)
    val lstIntSorted = isort(lstInt)
    println(lstIntSorted)

  }

  def isort(xs: List[Int]): List[Int] = xs match {
    case List()   => List()
    case x :: xs1 => insert(x, isort(xs1))
  }

  def insert(x: Int, xs: List[Int]): List[Int] = xs match {
    case List() => List(x)
    case y :: ys =>
      if (x <= y) x :: xs
      else y :: insert(x, ys)
  }
}
