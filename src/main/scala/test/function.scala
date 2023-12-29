package test

object function {
  private def add(x:Int, y:Int):Int = {
    return x+y
  }
  private def subtract(x:Int, y:Int) :Int = x-y // don't use return for one line function
  private def multiply(x:Int, y:Int) :Int = x*y
  private def divide(x:Int, y:Int) :Int = x/y
  def main(args: Array[String]): Unit = {
    println(add(1,2))
    println(subtract(1,2))
    println(multiply(1,2))
    println(divide(1,2))
  }

}
