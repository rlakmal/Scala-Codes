/*Company XYZ & Co. pays all its employees Rs.250 per normal working
  hour and Rs. 85 per OT hour. A typical employee works 40 (normal) and 30(OT)
hours per week has to pay 12% tax.
  Develop a functional program that determines the take home salary of an
  employee from the number of working hours and OT hours given.
*/


object Qe3 {
  def main(args: Array[String]): Unit = {
    var wrkpay = wrk(40);
    var otpay = oT(30);

    var tot_pay = wrkpay+otpay;

    var tax_pay = tax(tot_pay);
    println("Home salary : " + (tot_pay-tax_pay));
  }
  def wrk(hrs:Int)= hrs * 250;

  def oT(ot_hrs:Int)= ot_hrs*85;

  def tax(tp:Int)=tp*0.12;


}
