package myCode

import java.util.Date

object fully_partially_applied_function {

  def main(args: Array[String]): Unit = {
    // fully applied function
    var sum = (a:Int, b:Int, c:Int) => (a+b+c)
    println(sum(1,2,3)) // here we have passed all 3 args so this is fully applied function

    // partially applied function
    val f = sum(1,2,_:Int) // '_' is wild card means we are not sure what to pass there
    println(f(3)) // here we are passing one args which was left as above we have passed only 2

    val g = sum(1, _:Int,_:Int)
    println(g(2,3))

  }

}

object real_case{
  def log(date:Date, message:String)={
    println(date+"  "+message)
  }
  def main(args: Array[String]): Unit = {
    val date = new Date()
    val newLog = log(date,_:String)

    newLog("this is my first log")
  }
}
