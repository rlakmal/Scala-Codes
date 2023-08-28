
object L10_Q2 {
  def main(args: Array[String]): Unit = {
    var fruit =  List("apple","banana","cherry","date")
    countwords(fruit)
  }
  def countwords(value: List[String])={
    println("Total count of letter occurrences: "+ value.map(num=>num.length).reduce((x,y)=>x+y))
  }
}
