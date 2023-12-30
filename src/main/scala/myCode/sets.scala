package myCode
//sets do not accept duplicate value, they are immutable but we can make it mutable
object sets {
  def main(args:Array[String]): Unit = {
    val set = Set(1,2,2,3)
    println(set) // only 1,2,3,4 will be printed because sets don't accept duplicate value
    // make Set mutable by following
    var set1 = scala.collection.mutable.Set(1,2,3)
    println(set1.add(4))
    println(set1)
    println(set1+10)
    println(set1)

    println(set ++ set1) // will give all unique elements from both sets
    println(set.++(set1))
    println(set & set1) // give intersection of both sets
    println(set.&(set1))

    set.foreach(print)
    println()
    for(i <- set) println(i)
  }

}
