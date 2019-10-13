class Point_(val x: Int, val y: Int)

// applyメソッドでnewなしで生成可能
object Point_ {
  def apply(x: Int, y: Int): Point_ = new Point_(x, y)
}

object Pra7 {
  def main(args: Array[String]) {
    val p = Point_(2, 3)
    println(p.x)
  }
}

// 以下と同じ
case class Point(val x: Int, val y: Int)
