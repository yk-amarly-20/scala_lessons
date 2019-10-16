// vector
// List と違い、どの操作もほぼ同じ速さで計算可能

object Pra26 {
  def main(args: Array[String]) {
    val v = Vector(1, 2, 3, 4, 5)
    val v_1 = 6 +: v
    val v_2 = v :+ 6
    val v_updated = v.updated(2, 5)
  }
}
