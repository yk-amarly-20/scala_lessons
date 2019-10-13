object Pra22 {
  def main(args: Array[String]): Unit = {
    val lst = List(1, 2, 3, 4, 5)
    val str = lst.mkString
    println(str)
    val str_sep = lst.mkString(sep = ",")
    println(str_sep)
    val str_sur = lst.mkString("[", ",", "]")
    println(str_sur)
    val str_con = MakeString.joinByComma(1, 10)
    println(str_con)
  }
}

object MakeString {
  def joinByComma(start: Int, end: Int): String = {
    (start to end).toList.mkString(",")
  }
}
