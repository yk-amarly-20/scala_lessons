// 型クラス

object Nums {
  trait Num[A] {
    def plus(a: A, b: A): A
    def minus(a: A, b: A): A
    def multiply(a: A, b: A): A
    def divide(a: A, b: A): A
    def zero: A
  }

  object Num {
    implicit object IntNum extends Num[Int] {
      def plus(a: Int, b: Int): Int = a + b
      def minus(a: Int, b: Int): Int = a - b
      def multiply(a: Int, b: Int): Int = a * b
      def divide(a: Int, b: Int): Int = a / b
      def zero: Int = 0
    }

    implicit object DoubleNum extends Num[Double] {
      def plus(a: Double, b: Double): Double = a + b
      def minus(a: Double, b: Double): Double = a - b
      def multiply(a: Double, b: Double): Double = a * b
      def divide(a: Double, b: Double): Double = a / b
      def zero: Double = 0.0
    }
  }
}

object FromInts {
  trait FromInt[A] {
    def to(from: Int): A
  }

  object FromInt {
    implicit object FromIntToInt extends FromInt[Int] {
      def to(from: Int): Int = from
    }

    implicit object FromIntToDouble extends FromInt[Double] {
      def to(from: Int): Double = from
    }
  }
}

object Pra32 {
  def main(args: Array[String]): Unit = {}

  def average[A](
      lst: List[A]
  )(implicit a: Nums.Num[A], b: FromInts.FromInt[A]): A = {
    val length = lst.length
    val sum: A = lst.foldLeft(a.zero)((x, y) => a.plus(x, y))
    a.divide(sum, b.to(length))
  }
}
