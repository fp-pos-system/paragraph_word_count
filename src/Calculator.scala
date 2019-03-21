object Calculator {
  def main(args:Array[String]): Unit ={
    var opt:Char ='0';
    var ans:Double=0;
    var no:Double=0;
    var stop:Boolean=false;
    var ch:Char='0';

    do{
      opt=scala.io.StdIn.readChar();

      opt match{
        case '+'=>
          ch=scala.io.StdIn.readChar();
          if(ch.isDigit){
            no=(ch.asDigit)
            ans=ans+no;
            println("Answer : "+ans);
          }else{
            println("Invalid character entered");
            stop=true;
          }         

        case '-'=>
          ch=scala.io.StdIn.readChar();
            if(ch.isDigit){
              no=(ch.asDigit)
              ans=ans-no;
              println("Answer : "+ans);
          }else{
              println("Invalid character entered");
              stop=true;
          }         
          

        case '*'=>
          ch=scala.io.StdIn.readChar();
            if(ch.isDigit){
              no=(ch.asDigit)
              ans=ans*no;
              println("Answer : "+ans);
          }else{
              println("Invalid character entered");
              stop=true;
          }      
          

        case '/'=>
          ch=scala.io.StdIn.readChar();
            if(ch.isDigit){
              no=(ch.asDigit)
              ans=ans/no;
              println("Answer : "+ans);
          }else{
              println("Invalid character entered");
              stop=true;
          }      

        case '='=>
          println("Answer is: "+ans);
          stop=true;

        case _ =>
          if(opt.isDigit){
            if(ans==0){
              ans=opt.asDigit;
            }
          }else{
            println("Invalid character entered!");
            stop=true;
          }
      }

    }while(stop!=true)
  }
}
