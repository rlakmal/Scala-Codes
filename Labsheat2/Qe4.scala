object Qe4 {
  def main(args: Array[String]): Unit = {
    var price = 5;
    var max =0;
    var max_tickt_price =0;
    while(price<=40){
      val no_attend=attend(price);
      val tot_rev = total_revenue(no_attend, price);
      print("Ticket price : "+price+" " );
      var max_new=value(tot_rev, no_attend);
      println(":profit :"+max_new);
      if (max<max_new){
        max=max_new;
        max_tickt_price=price;
      }
      price += 5;

    }
    println("maximum profit is :"+max+" Ticket price is : "+ max_tickt_price);

  }

  def attend(price: Int): Int = 120 + ((15 - price) / 5 * 20);

  def total_revenue(attend_count: Int,price:Int): Int = attend_count * price;

  def value(total_price: Int,attendances:Int): Int = (total_price-(500+attendances*3));




}
