package myCode

class triangle(var width:Double, var height:Double) extends polygon {
  override def area: Double = width * height/2
}
