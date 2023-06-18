
//I run 2 km at an easy pace (8 min per km), then 3 km at Tempo (7
//min per km) and 2 km at easy pace again to reach home. What is the
//total running time

object Q5 {
  def main(args:Array[String]): Unit = {
    var totdistance = dist(2, 8) + dist(3, 7) + dist(2, 8)
    println("Total distance " + totdistance)
  }


  def dist(speed: Int, distance: Int) = speed * distance

}
