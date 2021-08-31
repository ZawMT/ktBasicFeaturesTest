fun main() {
    val nums = listOf(1, 2, 3, 4, 5, 6, 7, 8)
  
    //01: Using the keyword 'it' which is the implicit name of a singple parameter in a lambda expression
    //02: filter => Filtering lambda expression to a collection
    val nums2  = nums.filter { (it % 2) == 0 }
  
    println("Numbers to test")
    println(nums)
  
    println("Numbers divisable by 2")
    println(nums2)
  
   //03: Implicit return from a lambda expression (which is the last expression in the lambda: in this case it is 'ret')
  val nums3 = nums.filter {
    val ret = ((it % 3) == 0)
    ret
  }
  
  println("Numbers divisable by 3")
  println(nums3)
  
   //04: Explicit return from a lambda expression
   val nums4 = nums.filter {
    val ret = ((it % 4) == 0)
    return@filter ret
  }
  println("Numbers divisable by 4")
  println(nums4)
}
