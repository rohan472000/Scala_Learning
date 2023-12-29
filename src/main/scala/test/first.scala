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
    val (a,y) = (10,20) // another way to initialize constant variables

    if (a == 10 && y==20) println(true) // && is AND operator and || is OR operator
    else println(false)

    var res = ""
    if (a==10) res="a==10"
    else  res="a!=10"

    println("res is : "+res)
    val res1 = if(a==10) "a==10" else "a!=10"
    println("res1 is : "+res1)
  }
}
