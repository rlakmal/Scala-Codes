
object L5_Q3 {
  def main(args: Array[String]): Unit = {
    print("Enter Number to find sum : ");
    val num =  scala.io.StdIn.readInt();
    println("Sum is : "+sum(num));
  }

  def sum(n: Int): Int = n match {
    case x if x>1 => x+sum(x-1)
    case x => x
  }

}