import scala.annotation.tailrec

object L5_Q1 {
  def main(args: Array[String]): Unit = {
    print("Enter Int number : ");
    val num = scala.io.StdIn.readInt();
    prime(num);
  }
  def prime(n: Int): Unit = {
    if (n <= 1) {
      println("False");
    } else {
      println(checkPrime(n, 2));
    }
  }

  def checkPrime(n: Int, divisor: Int): Boolean = {
    for(i<- divisor to n){
      if(n%i==0 && i!=n){
        return false;
      }else if(i==n){
        return true;
      }
    }
      checkPrime(n, divisor+1);
    }
}