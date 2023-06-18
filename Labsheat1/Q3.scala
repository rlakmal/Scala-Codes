
//  The volume of a sphere with radius r is 4/3 Pi r3. What is the volume of a sphere with radius 5?
object Q3 {
  def main(args:Array[String]): Unit = {
    println(f"Volume is ${vol(5)}%1.2f")
  }


  def vol(rad: Double) = 4.0 / 3 * math.Pi * rad * rad * rad

}
