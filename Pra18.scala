// 高階関数
// 関数を引数にとる

object Pra18 {
  def main(args: Array[String]) {
    val num = 4
    val calc_num = double(num, square)
    println(calc_num)

  }

  def double(n: Int, f: Int => Int): Int = {
    f(f(n))
  }

  def square(n: Int): Int = n * n

  // ローンパターン
  def around(init: () => Unit, body: () => Any, fin: () => Unit): Any = {
    init()
    try {
      body()
    } finally {
      fin()
    }
  }
  // 二個目の処理で例外が発生しても、最後の処理を実行できる
}
