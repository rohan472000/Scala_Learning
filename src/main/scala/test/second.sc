
object first {

}
case class student(var roll:Int=1,var name:String="rohan",var marks:Int=90)
{
  def demo(): Unit = {
    print("inside demo function")
  }

  def >(v2 : student) = roll > v2.roll
}
var v1 = student(3)
var v2 = student(2)
v1.demo()
v1.>(v2) // here . is use to call method/function and > is method name, v2 is method parameter
//print("hey there")
//print("re re")
//
//var num:Int = 8
//var nm:Int =9
//var res = 8.+(9)
//print(res)


var nums = List(3,2,3,4)
for (n <- nums){print(n)}
nums.foreach{i:Int => print(i)}  // lambda function
nums.reverse
nums.sorted
nums.drop(2) // drop first 2 elements
nums.drop(2).take(1) // wil drop first 2 elements and take next first  element
nums drop 2 // will drop first 2 elements
nums drop 2 take 1

var lst = List(2,3,true)

case class test(roll:Int, name:String)
val test_list = List(test(2,"rohan"), test(3,"anand"), test(4,"chan")) // val means constant
val first = test_list.head
val last = test_list.tail
val rest = test_list.tail.head // to get tails first element, you can also use .tail to get tails last element

val top = test_list.filter(s => s.roll >3)
val partition = test_list.partition(s=> s.roll>2) // will be give all partition in single list

val part1 = partition._1 // to get first part of above partition
val part2  = partition._2  // to get second part of above partition