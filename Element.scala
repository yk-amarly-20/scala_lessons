object Element {
  def elem(contents: Array[String]): Element = {
    new ArrayElement(constents)
  }

  def elem(chr: Char, width: Int, height: Int): Element = {
    new UniformElement(chr, width, height)
  }

  def elem(line: String): Element = {
    new LineElement(line)
  }
}
