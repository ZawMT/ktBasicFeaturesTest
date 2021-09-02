fun main() {
 PrintEvenOdd(4) //4 is EVEN
  PrintEvenOdd(7) //7 is ODD
  
  PrintDiv(5, 4) //1.25
  PrintDiv(5,0) //The denominator cannot be zero
  PrintDiv(0, 9) //The numerator is zero so the result is 0
}

  //01: Kotlin doesn't support the tenary operator ?:, however, if result can be assigned 
  //So the tenary operation can be done like this
fun PrintEvenOdd(num: Int) {
  val isEven = if  (num%2 == 0)  true else false
    if (isEven)
    println("${num} is EVEN")
  else
    println("${num} is ODD")
}
  
//02: when 
fun PrintDiv(num1: Int, num2: Int) {
  when {
    num2 == 0 -> println("The denominator cannot be zero")
    num1 == 0 -> {
      println("The numerator is zero so the result is ${num1.toDouble()/ num2.toDouble()}")
    }
    else -> println(num1.toDouble()/ num2.toDouble())
  }
}
