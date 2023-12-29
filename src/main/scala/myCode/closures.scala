package myCode

object closures {

  // closures is a function which uses one or more variables declared outside of function
 // closures takes most recent value
    var num = 10
    def add(a:Int, b:Int): Int = a+b+num
    val amdd = (a:Int, b:Int)=>(a+b+num)
    def main(args: Array[String]): Unit = {
      println(add(1,2))
      println(amdd(1,2))

      num = 100 // closures takes most recent value
      println(add(1,2))
      println(amdd(1,2))


    }


}
