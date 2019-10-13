object pra {
  def main(args: Array[String]): Unit = {
    var num: Int = 10
    println(num)

    val num2 = 100
    println(num2)
    // varでは再代入できない
    // num2 = 10

    var float1 = 0.1
    var float2 = 0.1f

    var t = true
    var f = false

    val a = 'A'
    val b = '\u0041'

    val s = "hello"
    // """で囲うと生の文字列になる
    val es = """\"\'\\"""

  }
}
