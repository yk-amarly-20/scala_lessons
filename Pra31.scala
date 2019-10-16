// 暗黙のパラメータ

object Addtive {
  trait Addtive[A] {
    def plus(a: A, b: A): A
    def zero: A
  }

  implicit object StringAdditive extends Additive[A] {
    def plus(a: String, b: Stirng): String = a + b
    def zero: String = ""
  }

  implicit object IntAdditive extends Additive[A] {
    def plus(a: Int, b: Int): Int = a + b
    def zero: 0
  }

  case class Point(x: Int, y: Int)

  implicit object PointAdditive extends Additive[Point] {
    def plus(a: Point, b: Point): Point = Point(a.x + b.x, a.y + b.y)
    def zero: Point = Point(0, 0)
  }

  def sum[A](lst: List[A])(implicit m: Addtive[A]) = {
    lst.foldLeft(m.zero)((x, y) => m.plus(x, y))
  }

  case class Rational(num: Int, den: Int)

  object Rational {
    implicit object RationalAdditive extends Additive[Rational] {
      def plus(a: Rational, b: Rational): Rational = {
        if (a == zero) {
          b
        } else if (b == zero) {
          a
        } else {
          Rational(a.num * b.den + a.den * b.num, a.den * b.den)
        }

        def zero: Rational = Rational(0, 0)
      }
    }
  }
}
