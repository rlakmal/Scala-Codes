object L8_Q2 {
  def main(args: Array[String]): Unit = {
    println("Enter an integer:");
    val input: Int = scala.io.StdIn.readInt();

    println("Output :" + classifyNumber(input))
  }

  val classifyNumber: Int => String = (num: Int) => num match {
    case n if n <= 0 => "Negative/Zero is input"
    case n if n % 2 == 0 => "Even number is given"
    case _ => "Odd number is given"
  }


}
