object PrimeFilter {
  def filterPrime(numbers: List[Int]): List[Int] = {
    def isPrime(n: Int): Boolean = {
      if (n <= 1) false
      else if (n == 2) true
      else !(2 to n-1).exists(x => n % x == 0)
    }
    numbers.filter(isPrime)
  }

  def main(args: Array[String]): Unit = {
    val inputList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val primeList = filterPrime(inputList)
    println(primeList)
  }
}
