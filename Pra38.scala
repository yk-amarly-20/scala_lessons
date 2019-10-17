import scala.util.control.Breaks._
import java.io._

object Pra38 {
  def main(args: Array[String]): Unit = {
    SystemIn
  }
}

object SystemIn {
  val in = new BufferedReader(new InputStreamReader(System.in))

  breakable {
    while (true) {
      println("? ")
      if (in.readLine() == "") break
    }
  }
}
