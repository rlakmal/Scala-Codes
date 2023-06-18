//  The temperature is 35C; convert this temperature into Fahrenheit.

object Q2 {
  def main(args:Array[String]): Unit = {
    println("Fahrenheit is "+ far(35))
  }

  def far(cel: Double): Double = cel * 1.8 + 32
}
