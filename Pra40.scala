import scala.io.Source

object LongLines {
  def processFile(filename: String, width: Int) = {

    /** ファイルを読み取る　
      * @param filename: 読み取るファイル名
      * @param width: 読み取る最低文字数
      *
      */
    val source = Source.fromFile(filename)
    for (line <- source.getLines())
      processLine(filename, width, line)
  }

  private def processLine(filename: String, width: Int, line: String) = {

    /**
      * @param filename: 読み取るファイル名
      * @param width: 読み取る最低文字数
      * @param line: ファイルの各文
      *
      */
    if (line.length > width)
      println(filename + ": " + line.trim)
  }
}

object Pra40 {
  def main(args: Array[String]): Unit = {
    val filename = "Pra34.scala"
    val width = 5
    LongLines.processFile(filename, width)
  }
}
