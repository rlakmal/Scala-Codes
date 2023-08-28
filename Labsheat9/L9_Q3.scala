
object L9_Q3 {
  def main(args: Array[String]): Unit = {
  }
  case class Account(id: String, accno: String, balance: Double) {
    var NIC: String = id
    var AccountNo: String = accno
    var Balance: Double = balance
    private def withdraw(amnt: Double) = this.Balance = this.Balance - amnt
    private def deposite(amnt: Double) = this.Balance = this.Balance + amnt
    def transfer(that: Account, amnt: Double): Unit = {
      this.withdraw(amnt); that.deposite(amnt);
    }

    override def toString(): String = s"ID:${this.NIC}  Account No:${this.AccountNo}  Balance:${this.Balance}"
  }

  val acc01 = Account("001", "A:0908-9001", 50065.7)
  val acc02 = Account("002", "A:0908-9002", 10257.2)

  println("Before transfer")
  println(acc01)
  println(acc02)

  acc01.transfer(acc02, 2067);

  println("After transfer")
  println(acc01)
  println(acc02)
  }

