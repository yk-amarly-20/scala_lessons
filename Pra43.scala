// 待ち行列
import scala.collection.mutable.ArrayBuffer

abstract class IntQueue {
  def get(): Int
  def put(x: Int)
}

class BasicIntQueue extends IntQueue {
  private val buf = new ArrayBuffer[Int]
  def get() = buf.remove(0)
  def put(x: Int) = { buf += x }
}

trait Doubling extends IntQueue {
  abstract override def put(x: Int) = { super.put(2 * x) }
}

class MyQueue extends BasicIntQueue with Doubling

trait Incrementing extends IntQueue {
  abstract override def put(x: Int) = { super.put(x + 1) }
}

trait Filtering extends IntQueue {
  abstract override def put(x: Int) = {
    if (x >= 0) super.put(x)
  }
}

// トレイとのミックスインはだいたい右から実行される

object Pra43 {
  def main(args: Array[String]): Unit = {
    val queue = new BasicIntQueue
    queue.put(2)
    queue.put(4)
    println(queue.get())

    val myqueue = new MyQueue
    myqueue.put(2)
    myqueue.put(3)
    myqueue.put(5)
    println(myqueue.get())
  }
}
