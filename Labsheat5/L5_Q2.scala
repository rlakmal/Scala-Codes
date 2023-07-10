

import scala.util.control.Breaks.break;

object L5_Q2 {
  def main(args: Array[String]): Unit = {
    print("Enter Int number : ");
    val num = scala.io.StdIn.readInt();
    print(s"Sequence of prime numbers less than $num: are");
    printSeq(num,2);

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
  def printSeq(n: Int, i: Int) {
    if (n == i) {
        break();
    }
    if (checkPrime(i, 2)) {
      print(i+" ");
    }
    printSeq(n,i+1);


}


}
