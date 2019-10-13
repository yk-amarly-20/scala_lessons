class Person(name: String, age: Int, private val weight: Int)

object Person {
  def printWeight(): Unit = {
    val taro = new Person("taro", 20, 70)
    println(taro.weight)
  }
}

object Pro8 {
  def main(args: Array[String]): Unit = {
    Person.printWeight()
  }
}
