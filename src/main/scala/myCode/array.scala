package myCode

import Array._
object array {
  val arr:Array[Int] = new Array[Int](4)
  val arr1 = new Array[Int](5)
  val arr2 = Array(2,3,4,5)
  def main(args: Array[String]): Unit = {
   arr(0) = 1
    arr(1) = 2
    arr(2) = 3
    arr(3) = 4
    for(i <- arr) print(i)
    // or
    println()
    for (k <- 0 to (arr.length-1)) {
      //print(k)
      print(arr(k))
    }

    println()
    for (j <- arr2) print(j)
    println()
    val cnct = concat(arr,arr2)
    for (h <- cnct) print(h)
  }
}
