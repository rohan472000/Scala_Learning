package myCode

class rectangle(var width:Double, var height:Double) extends polygon {
  override def area: Double = width * height
}
