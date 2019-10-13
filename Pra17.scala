// 列挙型

sealed trait Fruit
// sealedをつけると、同ファイル内でのみ継承できるようになる
case object Itigo extends Fruit
case object Budou extends Fruit
case object Meron extends Fruit

object Pra17 {
  def main(args: Array[String]) {
    val fruit: Fruit = Itigo
    val message: String = fruit match {
      case Itigo => "いちごです"
      case Budou => "ぶどうです"
      case Meron => "メロンです"
    }

    println(message)
  }
}

sealed trait SmartPhone

case object IPhone extends SmartPhone
final case class Android(vender: String) extends SmartPhone
final case class Other(os: String, vender: String) extends SmartPhone
