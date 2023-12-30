package myCode
 class user(var name:String="rohan", var roll:Int=1){
   def print_name = {println(name)}
 }
object class_learning {
  def main(args:Array[String]): Unit = {
    var user1 = new user();
    user1.print_name
    println(user1.name)
    println(user1.roll)
    user1.name="anand"
    user1.roll = 2
    println(user1.name)
    println(user1.roll)
  }

}
