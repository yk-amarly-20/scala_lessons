object Pra4{
  def main(args:Array[String]): Unit ={
    for (x <- 1 to 5; y <- 1 until 5) {
      println("x = " + x + " y = " + y)
    }

    for (e <- List("A", "B", "C", "D", "E")) println(e)

    var x = for (e <- List("A", "B", "C", "D", "E")) yield {
      "Pre" + e
    }

    for (a <- 1 to 1000; b <- 1 to 1000; c <- 1 to 1000 if a*a == b*b + c*c){
      println(a, b, c)
    }
  }
}