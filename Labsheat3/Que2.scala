
object Que2 {

  def main(args: Array[String]): Unit = {
    var myList = List.empty[String]
    for(i<- 0 to 4){
      val str = scala.io.StdIn.readLine();
      myList = myList :+ str;

    }
    val filteredList = filterStrings(myList);
    println(filteredList);
  }

  def filterStrings(strings: List[String]): List[String] = {
    strings.filter(_.length >= 5);
  }

}



