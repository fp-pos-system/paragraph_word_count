object NumToWord {
  def main(args:Array[String]): Unit ={
    var no:Int=0;

    try{
      println("Enter the number : ");
      no=scala.io.StdIn.readLine().toInt;
      toWord(no);
      println();
    }catch {
      case e: NumberFormatException => println("Not a number!")
    }
  }

  def toWord(no:Int): Unit ={

    var x:Int=0;

    val nolen:Int=no.toString.length();
    var ones = Array("one", "two", "three", "four", "five", "six", "seven", "eight", "nine");
    var teens = Array("ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen");
    var tens = Array("", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety");
    var hundreds = Array("hundred", "thousand");

    nolen match {
      case 1=>{
        if(no==0)
          println("zero");
        else
          println(ones(no-1));
      }

      case 2=>{
        x=no/10;

        x match{
          case 1=>
            println(teens(no%10));

          case _=>{
            println(tens(x));

            if(no%10!=0)
              toWord(no%10);
          }
        }
      }

      case 3=>{
        x=no/100;
        println(ones(x-1)+" "+hundreds(0));

        if(no-x*100!=0)
          toWord(no-x*100);
      }

      case 4=>{
        x=no/1000;
        println(ones(x-1)+" "+hundreds(1));

        if(no-x*1000!=0)
          toWord(no-x*1000);
      }

      case 5=>{
        x=no/1000;
        toWord(x);
        println(hundreds(1));

        if(no%1000!=0)
          toWord(no%1000);

      }

      case _=>{
        println("Out of range");
      }

    }

  }

}
