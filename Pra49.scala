// テキスト中の文字数を返す
import scala.collection.mutable

object Pra49 {
  def main(args: Array[String]): Unit = {
    val text = "I can can a can!"
    val counts = countWords(text)
    println(counts)
  }

  def countWords(text: String) = {
    val counts = mutable.Map.empty[String, Int]
    for (rawWords <- text.split("[ !,.]+")) {
      val word = rawWords.toLowerCase
      val oldCounts =
        if (counts.contains(word)) counts(word)
        else 0
      counts += (word -> (oldCounts + 1))
    }
    counts
  }
}
