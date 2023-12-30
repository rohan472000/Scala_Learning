package myCode
// Options (Some or None)
object options {
  val lst = List(1,2,3,4)
  val tpl = new Tuple2(2,"rohan")
  val map = Map(1->"rohan",2->"anand")

  def main(args:Array[String]): Unit = {
    println(lst.find(_>1)) // will print some(2)
    println(lst.find(_>1).get) // print 2
    println(map.get(1))

    println(map.get(5)) // it will throw exception or none as 5 is not there in map
    println(map.getOrElse(5, "not present in map")) // it will not throw exception rather print the msg

    // define option
    val opt : Option[Int] = Some(2)
    println(opt)
    println(opt.get)
    println(opt.isEmpty)

  }
}
