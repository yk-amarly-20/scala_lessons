import java.util.Locale

object Pra5 {
  def main(args:Array[String]): Unit ={
    // match 式
    // Javaのswitch

    val taro = "Taro"
    var sex = taro match {
      case "Taro" => "Male"
      case "Jiro" => "Male"
      case "Hanako" => "Female"
    }

    println(sex)

    var one = 1
    var num = one match {
      case 1 => "one"
      case 2 => "two"
      // ワイルドカード
      case _ => "other"
    }

    println(num)

    // scala のmatch文にはフォールスルーが存在しない

    // パターンマッチ
    val lst = List("A", "B", "C")
    var lstval = lst match {
      case List("A", b, c) =>
        println("b = " + b)
        println("c = " + c)
      case _ =>
        println("Nothing")
    }

    // 中置きパターン　
    val lst2 = List("A", "B", "C")

    lst2 match {
      case "A" :: b :: c :: _ =>
        println("b = " + b)
        println("c = " + c)
      case _ =>
        println("Nothing")
    }

    // 型によるパターンマッチ
    val obj: AnyRef = "String Literal"
    obj match {
      case v:java.lang.Integer =>
        println("Integer!")
      case v:String =>
        println(v.toUpperCase(Locale.ENGLISH))
    }
     for (i <- 1 to 1000){
       val s = new scala.util.Random(new java.security.SecureRandom()).
         alphanumeric.take(5).toList match {
         case List(a, b, c, d, _) => List(a, b, c, d, a)
       }
       println(s)
     }

  }
}