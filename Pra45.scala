object Pra45 {
  def main(args: Array[String]): Unit = {}
  //  リストの結合
  def append(xs: List[T], ys: List[T]): List[T] = xs match {
    case List()   => ys
    case x :: xs1 => x :: append(xs1, ys)
  }

  // リストの長さ
  def length(xs: List[T]): Int = xs match {
    case List()   => 0
    case x :: xs1 => 1 + length(xs1)
  }

  // リストの反転
  def rev[T](xs: List[T]): List[T] = xs match {
    case List()   => xs
    case x :: xs1 => rev(xs1) ::: List(x)
  }
}
