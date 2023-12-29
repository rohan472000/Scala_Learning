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

object third{
  def main(args: Array[String]): Unit = {
    var x = 10

    // while loop
    while (x <20){
      println(x=x+1)
      x += 1
    }

    // for loop
    for (i <- 1 to 5) println("i :"+i)
    for (i <- 1.to(5)) println("i : "+i) // "." will access "to" as a function
    for (i <- 1.until(5)) println("i : "+i) // use of until
    for (i <- 1 until 5) println("i : "+i) // use of until as normal english word without "."
    // for loop for two variables
    for (i <- 1 to 5; j <- 5 to 8) println(s"i is : $i and j is : $j")
  }
}