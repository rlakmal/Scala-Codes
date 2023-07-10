
object L5_Q4 {
  def main(args: Array[String]): Unit = {
      println("Enter a number : ");
      val num = scala.io.StdIn.readInt();

      evenOdd(num)match {
        case true => println("Your number is an Odd number ");
        case false => println("Your Number is an even number ");
      }
  }

  def evenOdd(n:Int):Boolean = n match {
    case 1 => true;
    case 0 => false;
    case n => evenOdd(n-2);
  }

}
