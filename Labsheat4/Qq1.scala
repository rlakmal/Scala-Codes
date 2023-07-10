
object Qq1 {
  def main(args: Array[String]): Unit = {
    print("Enter your deposit amount :");    var dep = scala.io.StdIn.readDouble();
    println("Interest is "+ interest(dep));

  }
  def interest(deposit:Double):Double = deposit match {
    case deposit if deposit<=20000 => deposit*0.02;
    case deposit if deposit<=200000 => deposit*0.04;
    case deposit if deposit<=2000000 => deposit*0.035;
    case deposit if deposit>2000000 => deposit*0.065;

  }


}
