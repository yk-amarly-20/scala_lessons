// List
// immutable(一度作ったら中身を変更できない)

object Pra21 {
  def main(args: Array[String]): Unit = {
    Practice
  }
}

object Practice {
  val lst = List(1, 2, 3, 4, 5)
  // からはNil

  // ::(コンスと読む)でlistに左の要素を先頭にくっつける
  val lst2 = 1 :: 2 :: 3 :: 4 :: Nil
  println(lst2)

}
