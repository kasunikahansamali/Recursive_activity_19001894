import scala.io.StdIn._

object Addition extends App{

  def addNumbers(n:Int):Int={
     
     if(n==0)
        0
     else
       n+addNumbers(n-1)
     
  }



  print("Enter the number : ")
  var n=readInt()

  println(addNumbers(n))

}
