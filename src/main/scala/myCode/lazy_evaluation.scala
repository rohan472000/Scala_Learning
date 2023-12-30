package myCode

class lazy_evaluation {
  lazy val e ={
    print("lazy");
    9
  }
}
class evaluation{

  val l = {
    print("strict");
    9
  }
}
object demo{
  def main(args:Array[String]): Unit = {
    var a = new lazy_evaluation()
    var b = new evaluation()
    println()
    println(a.e)
    println(b.l)
  }
}