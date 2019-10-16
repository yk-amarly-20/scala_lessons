// map, filter, find, takeWhile, count

object Pra25 {
  def main(args: Array[String]) {
    val lst = List(1, 2, 3, 4, 5, 5)
    val lst_map = lst.map(x => x * 2)
    val lst_filter = lst.filter(x => x % 2 == 0)
    val lst_find = lst.find(x => x % 2 == 1)
    val lst_takeWhile = lst.takeWhile(x => x != 3)
    val lst_count = lst.count(x => x % 2 == 0)
    println(lst_map)
    println(lst_filter)
    println(lst_find)
    println(lst_takeWhile)
    println(lst_count)
  }
}
