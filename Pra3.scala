object Pra3{
  def main(args:Array[String]): Unit ={
    //scalaでは、{}で括った複数の式は順番に評価されて、一番最後の式が返り値となる
    var a = { println("A"); println("B"); 1 + 2;}
    println(a)

    // if文
    var age = 17
    var message = if (age < 18) {
      "18才未満です"
    } else {
      "18才以上です"
    }

    println(message)

    // if文に限らず、scalaでは全ての制御構文は全て式（値を返す）


    age = 5
    var isSchoolStarted: Boolean = false

    if (1 <= age && age <= 6 && isSchoolStarted) {
      println("幼児です")
    } else {
      println("幼児ではありません")
    }

    var i = 1
    while(i <= 10){
      println("i = " + i)
      i = i + 1
    }

    var j = 1
    do {
      println("j = " + j)
      j = j + 1
    } while(j <= 10)

    loopFrom0to9()

    // scalaにはbreak, continueに相当する構文は存在しない




  }

  def loopFrom0to9(): Unit = {
    var i = 0
    do {
      println(i)
      i += 1
    } while(i < 10)
  }
}