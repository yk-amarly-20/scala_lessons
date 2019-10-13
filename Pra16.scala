//　共変

trait Stack[+A] {
  def push[E >: A](e: E): Stack[E]
  def top: A
  def pop: Stack[A]
  def isEmty: Boolean
}

class NonEmptyStack[+A](private val first: A, private val rest: Stack[A])
    extends Stack[A] {
  def push[E >: A](e: E): Stack[E] = new NonEmptyStack[E](e, this)
  def top: A = first
  def pop: Stack[A] = rest
  def isEmty: Boolean = false
}

case object EmptyStack extends Stack[Nothing] {
  def push[E >: Nothing](e: E): Stack[E] = new NonEmptyStack[E](e, this)
  def top: Nothing = throw new IllegalArgumentException("empty stack")
  def pop: Nothing = throw new IllegalArgumentException("empty stack")
  def isEmty: Boolean = true
}

object Stack {
  def apply(): Stack[Nothing] = EmptyStack
}

object Pra16 {
  def main(args: Array[String]) {
    val stack: Stack[Int] = Stack()
    stack.push(3)
    val num: Stack[Int] = stack.pop
  }
}
