package test

object first {
  def main(args : Array[String]): Unit = {
    val age = 10
    val name = "rohan"
    println(s"$name is $age yrs old") // s string interpolation
    println(f"$name%s is $age%d yrs old") // f string interpolation
    println(s"hey \nworld") // s string interpolation has \n to print next line
    println(raw"hey \nworld") // raw interpolation prints exactly same as what have written
  }
}

object second{
  def main(args: Array[String]): Unit = {
    val a = 10
    if (a == 10) print(true)
    else print(false)
  }
}
