package myCode

object maps {
  def main(args:Array[String]): Unit = {
    val mymap:Map[Int,String] = Map(1->"rohan", 2->"anand")
    val mymap1:Map[Int,String] = Map(1->"ran", 2->"ana")
    val mymap2:Map[Int,String] = Map(3->"ran", 4->"ana")
    println(mymap)
    println(mymap.keys)
    println(mymap.values)

    mymap.keys.foreach{
      key => print("key : "+key); println("values : "+mymap(key))
    }

    println(mymap ++ mymap1) // if keys are same then it will take last one
    println(mymap ++ mymap2)
  }

}
