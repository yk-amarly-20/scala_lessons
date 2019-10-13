object Pra24 {
  def main(args: Array[String]): Unit = {
    val lst = (1 to 5).toList
    val lst_reverse = reverse(lst)
    println(lst_reverse)
  }

  // list の左右を反転させる
  def reverse[T](list: List[T]): List[T] = {
    list.foldLeft(Nil: List[T])((a, b) => b :: a)
  }

  def mkString[T](list: List[T])(sep: String): String = list match {
    case Nil => ""
    case head :: tl =>
      tl.foldLeft(head.toString) { (x, y) =>
        x + sep + y
      }
  }
}
