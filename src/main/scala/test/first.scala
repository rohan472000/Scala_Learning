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

    // list iterations by for loop
    val lst = List(2,3,4,5,65,34)
    for (i <- lst; if i < 6) print(i) // putting condition while iterating through if statement
    println()

    // using for loop as expression
    var list = for {i <- lst; if i < 8} yield{
      i * i
    }
    print(list)
  }
}

object fourth{
  def main(args: Array[String]): Unit = {
    val age = 10

    age match{
      case 12 => println(age)
      case 10 => println(age)
      case _ => println(19) //  default statement should be at last
    }

    // saving result in a variable
    val res = age match {
      case 12 => age
      case 10 => age
      case _ => 19 //  default statement should be at last
    }
    println("res is : "+res)

    // other way to use case statement
    val i = 7
    i match {
      case 1|3|5|7|9 => println("odd")
      case 2|4|6|8|10 => println("even")
    }
  }
}