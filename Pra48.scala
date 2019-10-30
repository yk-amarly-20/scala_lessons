import scala.collection.mutable

object Pra48 {
  def main(args: Array[String]): Unit = {
    val text = "See Spot run. Run, Spot. Run!"
    val wordsArray = text.split("[ ,.!]+")
     
    val words = mutable.Set.empty[String]
    for (word <- wordsArray){
      words += word.toLowerCase
    }

    
  }
}