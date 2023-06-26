
object Que3 {
  def main(args: Array[String]): Unit = {
    val num1 = scala.io.StdIn.readInt();
    val num2 = scala.io.StdIn.readInt();

    val ret_val =mean(num1,num2);
    println(ret_val);
  }

  def mean(num1: Int, num2: Int): String = {
    val ave = (num1+num2)/2.0;
    return (f"$ave%1.2f")
  }

}
