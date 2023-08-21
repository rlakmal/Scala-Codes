object L8_Q1 {
  def main(args: Array[String]): Unit = {
    val calculateInterest: Double => Double = (depositAmount: Double) => {
      depositAmount match {
        case amount if amount <= 20000 => amount * 0.02
        case amount if amount <= 200000 => amount * 0.04
        case amount if amount <= 2000000 => amount * 0.035
        case amount => amount * 0.065
      }
    }

    val depositAmount = 5000.0
    val interest = calculateInterest(depositAmount)
    println(s"Interest earned: $interest")
  }

}
