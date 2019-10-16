// 二項演算に関する構文木

sealed abstract class Exp
case class Add(lhs: Exp, rhs: Exp) extends Exp
case class Sub(lhs: Exp, rhs: Exp) extends Exp
case class Mul(lhs: Exp, rhs: Exp) extends Exp
case class Div(lhs: Exp, rhs: Exp) extends Exp
case class Lit(value: Int) extends Exp

object Evaluate {
  def eval(exp: Exp): Int = exp match {
    case Add(l, r) => eval(l) + eval(r)
    case Sub(l, r) => eval(l) - eval(r)
    case Mul(l, r) => eval(l) * eval(r)
    case Div(l, r) => eval(l) / eval(r)
    case Lit(v)    => v
  }
}

object Pra29 {
  def main(args: Array[String]): Unit = {
    val example = Add(Lit(1), Div(Mul(Lit(2), Lit(3)), Lit(2)))
    val result = Evaluate.eval(example)
    println(result)
  }
}
