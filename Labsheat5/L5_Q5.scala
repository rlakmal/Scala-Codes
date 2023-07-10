
object L5_Q5 {
  def main(args: Array[String]): Unit = {
    print ("Enter a number : ");
    val num = scala.io.StdIn.readInt();

    evenOdd(num)match {
      case true =>  println("Sum of all even numbers less than "+num +" is : "+ sumOfEven(num-1));
      case false => println("Sum of all even numbers less than "+num +" is : "+ sumOfEven(num-2));
    }
  }
  def sumOfEven(num: Int):Int = num match {
    case num if num>1 => num+ sumOfEven(num-2)
    case num=> num

  }

  def evenOdd(n:Int):Boolean = n match {
    case 1 => true;
    case 0 => false;
    case n => evenOdd(n-2);
  }

}
