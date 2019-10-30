object Pra46 {
  def main(args: Array[String]): Unit = {
    val lst = List(List(0, 0), List(1, 0))
    println(hasZeroRow(lst))
  }

  def hasZeroRow(m: List[List[Int]]) = {
    m exists (row => row forall (_ == 0))
  }
}
