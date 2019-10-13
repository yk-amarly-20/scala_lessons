// foldLeft

object Pra23 {
  def main(args: Array[String]): Unit = {
    val sum = (1 to 100).toList.foldLeft(0)((x, y) => x + y)
    println(sum)

    val predict = (2 to 31).toList.foldLeft(1)((x, y) => x * y)
    println(predict)
  }

}
