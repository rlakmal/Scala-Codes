import scala.math.Equiv.Float

object Qe1 {
  def main(args: Array[String]): Unit = {
    exp();
  }

  def exp(): Unit = {
    var k, i, j = 2;
    var m, n = 5;
    var f = 12.0f;
    var g = 4.0f;
    var c = 'X';

    println("a) k + 12 * m ="+ (k+12*m));
    println("b) m / j ="+(m/j));
    println("c) n % j ="+(n%j));
    println("d) m / j * j ="+(m/j*j));
    println("e) f + 10*5 +g =" +(f+10*5+g));
    println("f) ++i*n Error ");

    //in java ++i*n is working without any error
    // but in scala ++i*n is a compilation error
  }


}
