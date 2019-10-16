// 暗黙の型変換

class RichString(val src: String) {
  def smile: String = src + ":-)"
}

object Pra30 {
  def main(args: Array[String]): Unit = {
    val str = "Hello"
    val enrichStr = str.smile
    println(enrichStr)
  }

  implicit def enrichString(arg: String): RichString = new RichString(arg)
}
