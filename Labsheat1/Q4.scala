
//Suppose the cover price of a book is Rs. 24.95, but bookstores get a 40% discount.
// Shipping costs Rs. 3 for the first 50 copies and 75 cents for each additional copy.
// What is the total wholesale cost for 60 copies

object Q4 {
  def main(args:Array[String]): Unit = {
    var amount = bookscost(60)
    var dis = discount(amount)
    var shipcost = shipp(60)
    var cost = amount + shipcost - dis
    println(f"Total cost is $cost%1.2f")
  }


  def bookscost(cpy: Int) = cpy * 24.95

  def discount(amnt: Double) = amnt * 0.4

  def shipp(cpy: Int) = 3 * 50 + (cpy - 50) * .75

}
