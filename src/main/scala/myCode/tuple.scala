package myCode

object tuple {
  def main(args:Array[String]): Unit = {
    val tpl = (1,2,"rohan")
    val tpl1 = new Tuple2(1,"anand") // Tuple2 means this contains only 2 elements
    val tpl2 = new Tuple3(1,3,"anand") // Tuple3 means this contains only 3 elements
    println(tpl,tpl1,tpl2)
    println(tpl._1) // to give first element of tpl
    println(tpl._2) // to give 2nd element of tpl

    // iteration through tuples
    tpl.productIterator.foreach{
      i=>println(i)
    }

    val tpl3 = new Tuple4(1,3,"anand",(2,"rhn"))
    println(tpl3._4._1)// taking out first element of 3rd element in tuple
  }

}
