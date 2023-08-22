
object L9_Q2 {
  class Rational(n: Int, d: Int) {
    require(d > 0, "denominator must be greater than 0")

    def enumerator: Int = n

    def denominator: Int = d

    // if the rational number can further simplify then simplify

    def simplify = this.enumerator match {
      case x if (x >= 0) => new Rational(this.enumerator.abs / gcd(this.enumerator.abs, this.denominator.abs), this.denominator.abs / gcd(this.enumerator.abs, this.denominator.abs))
      case x if (x < 0) => new Rational(this.enumerator.abs / gcd(this.enumerator.abs, this.denominator.abs), this.denominator.abs / gcd(this.enumerator.abs, this.denominator.abs)).neg
    }

    // new rational number with enumerator and denominator as below
    // enumerator = first.enumerator x second.denominator + first.denominator x second.enumerator
    // denominator = first.denominator x second.denominator
    // affter adding simplify the result
    def -(r: Rational) = this.add(r.neg)
    def add(r: Rational) = (new Rational(this.enumerator * r.denominator + this.denominator * r.enumerator, this.denominator * r.denominator)).simplify

    def neg = new Rational(-this.enumerator, this.denominator)

    override def toString(): String = enumerator + "/" + denominator

  }

  def gcd(a: Int, b: Int): Int = {
    if (b == 0) a else gcd(b, a % b)
  }

  def main(args: Array[String]): Unit = {
    val x = new Rational(3, 4)
    val y = new Rational(5, 8)
    val z = new Rational(2, 7)

    val a = x - y - z

    println(a)

  }


}
