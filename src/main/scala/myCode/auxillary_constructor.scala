package myCode

class  student(var name:String, var roll:Int){
  // constructor which takes no args
  def this() {
    this("rohan",1)
  }
  // constructor which takes only name as args
  def this(name:String) {
    this(name,1)
  }
}
object auxillary_constructor {

  def main(args: Array[String]): Unit = {
    var std1 = new student() // will have "rohan" and 1 as default value
    var std2 = new student("anand") // will have "anand" and 1
    var std3 = new student("chan",3) // "chan", 3


  }

}
