
object Qq2 {
  def main(args:Array[String]):Unit={
    print("Enter Integer number :");
    val num = scala.io.StdIn.readInt();
    print("Number is :"+ patternMatching(num));


  }
  def patternMatching(num:Int):String = num match {
    case num if num<=0 => "Negative/Zero"
    case num if num%2==0 => "Even";
    case num if num%2==1 => "Odd";
  }

}
