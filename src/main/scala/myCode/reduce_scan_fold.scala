package myCode

object reduce_scan_fold {
  val lst = List(1,2,3,4)
  val lst2 = List("A","B","C")

  def main(args:Array[String]): Unit = {
   println(lst.reduceLeft(_+_))
    println(lst.reduceRight(_+_))
    println(lst.reduceLeft((x,y)=>{println(x+" , "+y);x+y}))
    println(lst.reduceRight((x,y)=>{println(x+" , "+y);x-y}))

    println(lst2.reduceLeft(_+_))
    println(lst2.reduceRight(_+_))

    println(lst2.reduceLeft((x,y)=>{println(x+" , "+y);x+y}))
    println(lst2.reduceRight((x,y)=>{println(x+" , "+y);x+y}))

    // fold
    println(lst.foldRight(100)(_+_))
    println(lst.foldLeft(100)(_+_))

    // scan
    println(lst.scanLeft(100)(_+_))
    println(lst.scanRight(100)(_+_))
    println(lst2.scanLeft("100")(_+_))
    println(lst2.scanRight("100")(_+_))
  }

}
