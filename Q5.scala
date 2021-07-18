import scala.io.StdIn._

object AdditionOfEven extends App{

  def additionofeven(n:Int):Int={
     if(n%2==0){
        if(n==0)
           0
        else
           n+additionofeven(n-1)
     }
     else{
        additionofeven(n-1)
     }
     
  }



  print("Enter the number : ")
  var n=readInt()

  println(additionofeven(n))

}
