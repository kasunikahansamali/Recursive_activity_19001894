import scala.io.StdIn._

object PrimeNo extends App{

  def findgcd(x:Int,y:Int):Int=y match{
    case 0=>x
    case y if(y>x) =>findgcd(y,x)
    case _ =>findgcd(y,x%y)
  }

  def findPrime(n:Int,i:Int):Boolean= n match{
    case n if n==i => true

    case n if findgcd(n,i)>1 => false

    case m  =>findPrime(n,i+1)

   }


  print("Enter the number : ")
  var n=readInt()

  println(findPrime(n,2))

}
