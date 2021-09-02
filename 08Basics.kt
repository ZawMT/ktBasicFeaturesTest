fun main() {
  //01: vararg
  val nums = arrayOf(2, 3, 56)
  printDouble(2, 4)  //Will call vararg function
  printDouble(nums) //Will call Array function
  //printDouble(*nums) //Will cause ERROR
  
  //Spread operator *
  val nums2 = intArrayOf(2, 3, 56)
  printDouble(*nums2) //Will call vararg function
}

fun printDouble(vararg nums: Int){
  println("Function which takes vararg as param")
  nums.map{ 2 * it}.forEach{ println(it) }
}

fun printDouble(nums: Array<Int>){
  println("Function which takes arrary as param")
  nums.map{ 2 * it}.forEach{ println(it) }
}
