package myCode

object function {
 def add(x:Int, y:Int):Int = {
    return x+y
  }
  def subtract(x:Int, y:Int) :Int = x-y // don't use return for one line function
  def multiply(x:Int, y:Int) :Int = x*y
  def divide(x:Int, y:Int) :Int = x/y

  object math{
    def m_add(x:Int, y:Int):Int = {
      return x+y
    }
    def m_subtract(x:Int, y:Int) :Int = x-y // don't use return for one line function
    def m_multiply(x:Int, y:Int) :Int = x*y
    def m_divide(x:Int, y:Int) :Int = x/y
  }
  def main(args: Array[String]): Unit = {
    println(add(1,2))
    println(subtract(1,2))
    println(multiply(1,2))
    println(divide(1,2))

    println(math.m_add(2,3)) // math is already a object so dont need to make a object to call its function
    println(math.m_subtract(2,3))
    println(math.m_multiply(2,3))
    println(math.m_divide(2,3))

    val amdd = (x:Int, y:Int) => x+y
    println(amdd(100,200))
  }

}
