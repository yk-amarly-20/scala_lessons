object Pra37 {
  def main(args: Array[String]): Unit = {
    val firstArg = if (args.length > 0) args(0) else ""
    firstArg match {
      case "salt"  => println("pepper")
      case "chips" => println("salsa")
      case "eggs"  => println("bacon")
      case _       => println("huh?")
    }
  }
}
