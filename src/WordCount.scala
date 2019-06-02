import scala.io.Source

object WordCount {
  def main(args: Array[String]): Unit ={

    //initializing a map
    var a:Map[String,Int] = Map()

    //input file
    val inputstring = Source.fromFile("data.txt").mkString;

    //split the string
    var splitted = inputstring.split("[\\s+.]");

    //adding key value pairs to the map
    for(c <- splitted){
      if(a.contains(c)){
        var temp = a(c);
        temp+=1;
        a+=(c->temp);
      }else{
        a+=(c->1);
      }
    }
    println(a);

  }
}
