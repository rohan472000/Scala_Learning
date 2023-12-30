package myCode

class polygon {
  def area:Double = 10.0

}

object polygon{
  def main(args:Array[String]): Unit = {
    var poly = new polygon()
    var rect = new rectangle(3,4)
    var trai = new triangle(4,7)

    print_area(poly)
    print_area(rect)
    print_area(trai)
  }
  def print_area(p:polygon): Unit = {
    println(p.area)
  }
}
