package myCode

object lazy_eval {
  def method1(n:Int): Unit = {
    println("method1")
    println(n)
  }
  def method2(n: => Int): Unit = {
    println("method2")
    println(n)
  }

  def main(args:Array[String]): Unit = {
     val add = (a:Int,b:Int) => {
       println("add")
       a+b
     }

    method1(add(3,4))
    method2(add(3,4))
  }
}
