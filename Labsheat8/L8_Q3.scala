
object L8_Q3 {
  def main(args: Array[String]): Unit = {
    println(toUpper("Benny"));
    println(formatNames("Niroshan", 1));
    println(toLower("Saman"));
    println(formatNames("Kumara", 5));
  }

  val toUpper: String => String = (input: String) => input.toUpperCase()
  val toLower: String => String = (input: String) => input.toLowerCase()
  val formatNames: (String, Int) => String = (word: String, index: Int) => {
    val wordChar = word.charAt(index)
    val modified = wordChar.toUpper
    word.patch(index, modified.toString, 1)
  }
}



