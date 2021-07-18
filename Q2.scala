import scala.io.StdIn._
import scala.util.control.Breaks._

object PrimeNumberSeq extends App{

  def findgcd(a:Int,b:Int):Int=b match{
    case 0=>a
    case b if(b>a) =>findgcd(b,a)
    case _ =>findgcd(b,a%b)
  }

  def findPrime(n:Int,i:Int):Boolean= n match{
    case n if n==i => true

    case n if findgcd(n,i)>1 => false

    case x  =>findPrime(n,i+1)

   }    

  def printSeq(n:Int,i:Int):Int={
     if(n==i) {
        break
     }

     if(findPrime(i,2)){
       println(i)
     }

     printSeq(n,i+1)
     
  }
  print("Enter a Number : ")
  var n=readInt()

  printSeq(n,2)

}

