object L6_Q {
  def main(args: Array[String]): Unit = {
    Cipher();

  }
  def Cipher(): Unit = {
    println("For Encrypt Enter Number 1 : ");
    println("For Decrypt Enter Number 2 : ");
    val num = scala.io.StdIn.readInt();
    num match {
      case 1=>println("Eneter string to Encrypt : ");
              val input = scala.io.StdIn.readLine();
              println("Enter key : ");
              val key = scala.io.StdIn.readInt();
              println(encrypt(input, key));

      case 2=> println("Eneter string to Decrypt : ");
              val input = scala.io.StdIn.readLine();
              println("Enter key : ");
              val key = scala.io.StdIn.readInt();
              println(decrypt(input, key));
    }

  }
  def encrypt(x: String, y: Int): String = x.length()match {
    case 0 => ""
    case _ if (x.head <= 'Z' && x.head >= 'A') => (65 + (x.head.toInt + y - 65) % 26).toChar + encrypt(x.tail, y);
    case _ if (x.head <= 'z' && x.head >= 'a') => (97 + (x.head.toInt + y - 97) % 26).toChar + encrypt(x.tail, y);
    case _ => x.head + encrypt(x.tail, y);
  }

  def decrypt(x: String, y: Int): String = x.length() match {
    case 0 => ""
    case _ if (x.head <= 'Z' && x.head >= 'A') => (65 + (x.head.toInt+26 - y - 65) % 26).toChar + decrypt(x.tail, y);
    case _ if (x.head <= 'z' && x.head >= 'a') => (97 + (x.head.toInt+26 - y - 97) % 26).toChar + decrypt(x.tail, y);
    case _ => x.head + encrypt(x.tail, y);
  }
}