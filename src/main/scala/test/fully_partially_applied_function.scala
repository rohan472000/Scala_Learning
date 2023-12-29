package test

object fully_partially_applied_function {

  def main(args: Array[String]): Unit = {
    var sum = (a:Int, b:Int, c:Int) => (a+b+c)
    println(sum(1,2,3)) // here we have passed all 3 args so this is fully applied function

    val f = sum(1,2,_:Int) // '_' is wild card means we are not sure what to pass there
    println(f(4)) // here we are passing one args which was left as above we have passed only 2
  }

}
