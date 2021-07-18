import scala.io.StdIn._
import scala.util.control.Breaks.break

object FibonacciSeq extends App{

def printfibonacci(n:Int,i:Int):Int={
    
      if(n==i)
          break
       else
         println(fibonacci(i))
      printfibonacci(n,i+1)
      
}
  def fibonacci(n:Int):Int={
     
     if(n<=1)
        n
     else
        fibonacci(n-1)+fibonacci(n-2) 
     
  }
  
//   def printfibonacci(n:Int,i:Int):Int={
    
//       if(n==i)
//           break
//        else
//          println(fibonacci(i))
//       printfibonacci(n,i+1)
      
// }

  print("Enter the number : ")
  var n=readInt()

  printfibonacci(n,0)

}
