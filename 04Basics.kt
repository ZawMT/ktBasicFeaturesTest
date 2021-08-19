fun main(args: Array<String>) {
  //01: Array 
  val arrTest = arrayOf("Abc", 0.51, 2341)
  println(arrTest) //Abc,0.51,2341
  println(arrTest::class) //class Array
  
  //The following loop will print these
  //Abc is class String
  //0.51 is class Double
  //2341 is class Int
  for(e in arrTest){
    println("$e is " + e::class) 
  }
  
  //Access the value
  println(arrTest.get(0))//Abc

  //Change the value
  arrTest.set(0, "CC")
  println(arrTest) //CC,0.51,2341
  //Change the value to a different data type
  arrTest.set(1, "BN")
  println(arrTest) //CC, BN, 2341

  //02: Int Array
  val arrInt = intArrayOf(1, 234, 6)
  println(arrInt::class) //class IntArray
  //val arrInt = intArrayOf(1, 234, 6.5)
  //The line above will cause the following error
  //The floating-point literal does not conform to the expected type Int
  //Then there are typed arrays such as
  //BooleanArray, ByteArray, CharArray, DoubleArray, etc.

  //03: List
  val lstTest = listOf(111,2222)
  println(lstTest::class) //class ArrayList
  
  //The following loop will print these
  //111 is class Int
  //222 is class String
  for(e in lstTest){
    println("$e is " + e::class) 
  }
  
  println(lstTest.get(0)) //111
  
  //The following line will cause compilation error 
  //lstTest[0] = 222 ////Error: No set method providing array access

  //If the list is mutable then the assignment is ok
  //val lstTest = mutableListOf(111,2222)
  //lstTest[0] = 222 //OK!
  //println(lstTest.get(0)) //222

  //If the values are of mix as below 
  //val lstTest = mutableListOf(111,"BBB")
  //lstTest[0] = 222 //Error: The integer literal does not conform to the expected type Nothing
  //So far no workaround for this
}
