import scala.io.StdIn._

object EvenOdd {
  def isEven(n : Int): Boolean = {
    if(n ==0){
        return(true);
    }else if (n == 1){
        return(false);
    }else {
        return(isEven(n - 2));
    }
  }
  
  def main(args: Array[String]):Unit={
   print("Enter a Number : ")
   var n=readInt()
    if(isEven(n) == true)
      println("EVEN")
    else
      println("ODD")
    
  }
}
