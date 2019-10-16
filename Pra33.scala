object Pra33 {
  def main(args: Array[String]): Unit = {
    args.foreach(arg => println(arg))

    val greetString: Array[String] = new Array[String](3)
    greetString(0) = "Hello"
    greetString(1) = ", "
    greetString(2) = "world\n"

    for (i <- 0 to 2) {
      print(greetString(i))
    }

    greetString.updated(0, "Hello")
  }
}
