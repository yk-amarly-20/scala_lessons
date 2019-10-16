// scala.collection.immutable.map
import scala.collection.mutable

object Pra27 {
  def main(args: Array[String]) {
    val m = Map("A" -> 1, "B" -> 2, "C" -> 3)
    println(m("A"))
    val mm = mutable.Map("A" -> 1, "B" -> 2, "C" -> 3)
    mm("A") = 10
    println(mm("A"))

  }
}
