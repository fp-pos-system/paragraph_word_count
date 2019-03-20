object Calculator {
  def main(args:Array[String]): Unit ={
    var opt:Char ='0';
    var ans:Double=0;
    var no:Double=0;
    var stop:Boolean=false;

    do{
      opt=scala.io.StdIn.readChar();

      opt match{
        case '+'=>
          no=scala.io.StdIn.readInt();
          ans=ans+no;

        case '-'=>
          no=scala.io.StdIn.readInt();
          ans=ans-no;

        case '*'=>
          no=scala.io.StdIn.readInt();
          ans=ans*no;

        case '/'=>
          no=scala.io.StdIn.readInt();
          ans=ans/no;

        case '='=>
          println("Answer is : "+ans);
          stop=true;

        case _ =>
          if(opt.isDigit){
            if(ans==0){
              ans=opt.asDigit;
            }else{
              no=opt.asDigit;
            }

          }else{
            println("Invalid character entered!");
            stop=true;
          }
      }

    }while(stop!=true)
  }
}
