package myCode

object map_filter_flatten {
  val map1 = Map(1->"rohan", 2-> "anand")
  val lst = List(1,2,3,4,5)
  def main(args:Array[String]): Unit = {
    println(lst.map(_*2)) // make every element of list double
    println(lst.map(x => x*2)) // make every element of list double
    println(lst.map(x => "hi"*x)) // List(hi, hihi, hihihi, hihihihi, hihihihihi)


    println(map1.map(x=>"hi"+x)) // List(hi(1,rohan), hi(2,anand))
    println(map1.mapValues(x=>"hi"+x))

    // flatten
    println(List(List(1,2,3),List(4,5)).flatten)
    println(lst.flatMap(x => List(x,x+1))) // List(1, 2, 2, 3, 3, 4, 4, 5, 5, 6)

    // filter
    println(lst.filter(x => x%2==0)) // List(2, 4)
  }

}
