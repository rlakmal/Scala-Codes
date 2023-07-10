
object L5_Q6 {
  def main(args: Array[String]): Unit = {
    print("Enter a number : ")
    var num = scala.io.StdIn.readInt()
    print("First " +num+" fibonacci numbers are : ")
    printfibonacci(num)

  }
  def fibonacci(x: Int): Int = x match {
    case 1 => 0
    case 2 => 1
    case _ => fibonacci(x - 1) + fibonacci(x - 2)
  }

  def printfibonacci(x: Int): Unit = x match {
    case 1 => print(fibonacci(1).toString + " ")
    case x => printfibonacci(x - 1); print(fibonacci(x).toString + " ");
  }


}
