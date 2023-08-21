object L9_Q1 {
  class Rational(n: Int, d: Int) {
    require(d > 0, "denominator must be greater than 0")
    def enumerator: Int = n
    def denominator: Int = d
    def neg = new Rational(-this.enumerator, this.denominator)
    override def toString(): String = enumerator + "/" + denominator
  }

  def main(args: Array[String]): Unit = {
    val obj = new Rational(7, 8)
    println(obj.neg)
  }

}
