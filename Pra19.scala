// Array

object Pra19 {
  def main(args: Array[String]) {
    val arr = Array[Int](1, 2, 3, 4, 5)

    // 配列の要素数
    val num = arr.length

    swapArray(arr)(2, 3)

  }

  def swapArray[T](arr: Array[T])(i: Int, j: Int): Unit = {
    val tmp = arr(i)
    arr(i) = arr(j)
    arr(j) = tmp
  }
}
