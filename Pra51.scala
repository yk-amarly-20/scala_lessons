// 抽象メンバ

trait Abstract {
  type T
  def transform(x: T): T
  val initial: T
  val current: T
}

class Concrete extends Abstract {
  type T = String
  def transform(x: String) = x + x
  val initial = "hi"
  val current = initial
}

abstract class Fruit {
  val v: String
  def m: String
}

abstract class Apple extends Fruit {
  val v: String
  val m: String // "def"　を　"val"でオーバーライドするのはok
}

abstract class BadApple extends Fruit {
  def v: String // "val"を"def"でオーバーライドするのはok
  def m: String
}

trait AbstractTime {
  var hour: Int
  var minute: Int
}

trait RationalTrait {
  val numerArg: Int
  val denomArg: Int
  require(denomArg != 0)
  private val g = gcd(numerArg, denomArg)
  val numer = numerArg / g
  val denom = denomArg / g
  private def gcd(a: Int, b: Int): Int = {
    if (b == 0) a else gcd(b, a % b)
  }
  override def toString = numer + "/" + denom
}

class RationalClass(n: Int, d: Int) extends {
  val numerArg = n
  val denomArg = d
} with RationalTrait {
  def +(that: RationalClass) = new RationalClass(
    numer * that.denom + that.numer * denom,
    denom * that.denom
  )
}

trait LazyRationalTrait {
  val numerArg: Int
  val denomArg: Int
  lazy val numer = numerArg / g
  lazy val denom = denomArg / g
  override def toString = numer + "/" + denom
  private lazy val g = {
    require(denomArg != 0)
    gcd(numerArg, denomArg)
  }
  private def gcd(a: Int, b: Int): Int = {
    if (b == 0) a else gcd(b, a % b)
  }
}
