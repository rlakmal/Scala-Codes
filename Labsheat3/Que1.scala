
object Que1 {
  def main(args: Array[String]): Unit = {
    var inp_str = scala.io.StdIn.readLine();
    recursive_text(inp_str);
  }

  def recursive_text(str: String): Unit = {

    if(str.length !=0) {
      var letter_one = str.charAt(0);
      recursive_text(str.substring(1));
      print(letter_one);
    }
  }

}
