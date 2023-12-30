package myCode

object list {
  def main(args:Array[String]): Unit = {
    val lst = List(1,4,2,3)
    println(lst)
    println(0::lst)
    println(0::9::lst)
    println(lst.head)
    println(lst.tail)
    println(lst.tail.head)
    lst.foreach(print) // it will print all elements of lst
    println()

    var sum:Int =0
    lst.foreach(sum+=_)
    println(sum)

    println()
    print(List.fill(5)(2)) //   length of 5 and filled with values 2

  }

}
