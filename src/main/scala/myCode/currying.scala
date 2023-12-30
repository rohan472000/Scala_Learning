package myCode
// currying is way to transform a function which takes 2 or more args to single arg.
object currying {

  def add(x:Int): Int => Int = (y:Int)=>x+y // here it is taking one arg as x
  def add2(x:Int)(y:Int) = x+y // other way to use currying
def main(args:Array[String]): Unit = {
  println(add(2)(3)) // 2+3=5

  // we can apply partially filled function also
  val sum = add(3) // only one arg passed, rest one is passed below
  println(sum(5)) // 3+5=8


  // other way to use currying
  println(add2(100)(200))
  //or
  val sc = add2(20)_
  println(sc(20))
}
}
