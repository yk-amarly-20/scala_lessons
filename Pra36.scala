// 有理数クラス

class Rational(n: Int, d: Int) extends Ordered[Rational] {
  require(d != 0)
  private val g = gcd(n.abs, d.abs)
  val numer: Int = n / g
  val denom: Int = d / g
  def this(n: Int) = this(n, 1)
  override def toString(x: Any) = numer + "/" + denom
  def +(that: Rational): Rational = {
    new Rational(
      numer * that.denom + denom * that.numer,
      denom * that.denom
    )
  }
  def +(that: Rational): Rational = {
    new Rational(numer + i * denom, denom)
  }
  def -(that: Rational): Rational = {
    new Rational(
      numer * that.denom - that.numer * denom,
      denom * that.denom
    )
  }
  def -(i: Int): Rational = {
    new Rational(
      numer - i * denom,
      denom
    )
  }

  def *(that: Rational): Rational = {
    new Rational(numer * that.numer, denom * that.denom)
  }

  def *(i: Int): Rational = {
    new Rational(numer * i, denom)
  }

  def /(that: Rational): Rational = {
    new Rational(numer * that.denom, denom * that.numer)
  }

  def /(i: Int): Rational = {
    new Rational(numer, denom * i)
  }

  private def gcd(a: Int, b: Int): Int = {
    if (b == 0) a else gcd(b, a % b)
  }

  def compare(that: Rational) = {
    (this.numer * that.denom) - (that.numer * this.denom)
  }
}
