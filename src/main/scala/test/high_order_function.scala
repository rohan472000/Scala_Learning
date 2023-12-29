package test

object high_order_function {
  def math(x:Double, y:Double, f:(Double, Double)=>Double) : Double = f(x,y)
  def main(args: Array[String]): Unit = {
    val res = math(20,30,(x,y)=>x-y)
    println(res)
  }

}

object high_order_function_second {
  def math(x:Double, y:Double,z:Double, f:(Double, Double)=>Double) : Double = f(f(x,y),z)
  def main(args: Array[String]): Unit = {
    val res = math(20,30,10,(x,y)=>x-y) // -10-10=-20
    val res1 = math(20,30,10,_-_) // '_' works same as any other variable, _ called wild card
    val res2 = math(20,30,10,_ max _) // give max of 3 numbers
    println(res)
    println(res1)
    println(res2)
  }

}

