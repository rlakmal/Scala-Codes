object L9_Q4 {

  def main(args: Array[String]): Unit = {
  }
  case class Account(accno: String, balance: Double) {
    var AccountNo: String = accno
    var Balance: Double = balance
    override def toString: String = s"Account No:${this.AccountNo}  Balance:${this.Balance}"
  }
  case class Bank() {
    var accounts: List[Account] = List();
    def addOneAccount(acc: Account): Unit = {
      this.accounts = this.accounts :+ acc
    }
    def addAccounts(accs: List[Account]): Unit = {
      accs.foreach(addOneAccount(_))
    }
    def printBank(): Unit = this.accounts.foreach(println(_))
    def listNegative(): Unit = this.accounts.filter(_.Balance < 0).foreach(println(_))
    def calculateSum(): Account = this.accounts.reduce((x, y) => Account("", x.Balance + y.Balance))
    def calculateInterest(x: Account): Double = if (x.Balance < 0) x.Balance * 0.1 else x.Balance * 0.05
    def finalBalances(): Unit = this.accounts = this.accounts.map((x) => (Account(x.accno, x.Balance + calculateInterest(x))))
  }
  var testBank: Bank = Bank()
  testBank.addAccounts(List(Account("1021-01", 7500), Account("1021-02", -204)))
  // testBank.printBank()
  println("Negative balance accounts: ")
  testBank.listNegative()

  println("\nSum of all balances:")
  println(testBank.calculateSum().Balance)

  println("\nFinal balances: ")
  testBank.finalBalances()
  testBank.printBank()
}
