object Qe2 {
    def main(args:Array[String]): Unit = {
      exp();

    }

      def exp(): Unit = {
      var(a,b,c,d:Int)=(2,3,4,5);
      var k:Float = 4.3f;

        b -=1;
        println("--b*a + c*d-- : "+ (( b * a) + (c *d )));
        d -=1;

        println("a++ : "+ a);
        a+=1;

        println("–2 * ( g–k ) +c : "+(-2*(d-k)+c));

        println("c=c++ : "+c);
        c+=1;

        c+=1;
        println("c=c++c*a++ :"+c*a);
        a+=1;


    }



}
