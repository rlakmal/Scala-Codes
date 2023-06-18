
//. Area of a disk with radius r is Pi r*r. What is the area of a disk with radius 5?
object Q1 {
  def main(args:Array[String]): Unit = {
    var ar = area(5)
    println(f"Area is $ar%1.2f")

  }

  def area(rad: Double) = math.Pi * rad * rad


}
