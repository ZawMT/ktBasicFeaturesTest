fun main(args: Array<String>) {
  //01: trimMargin : default parameter is |
  println("""Trim Margin -
  - testing -""".trimMargin("-")) 
  //Output for above will be
  //Trim Margin -
  // testing -
  println("""|Trim Margin -
  || testing -""".trimMargin())
  //Output for above will be
  //Trim Margin -
  //| testing -

  //02: == and === : Same concept as in Java ... however ...
  val strTest = "abc"
  println(strTest.toUpperCase().toLowerCase()==strTest) // true
  //The following will be evaluated as
  //true in Kotlin/JS
  //false in Kotlin/JVM
  println(strTest.toUpperCase().toLowerCase()===strTest)

  //03: Type intelligence
  var v1 = 5
  var v2 : Long = 5
  println(v1::class) //class kotlin.Int
  println(v2::class) //class kotlin.Long
  val v3 = 5
  //v3 = 5 //Compile error: val cannot be reassigned

  //04: String interpolation
  println("v3 has the value of " + v3 + " and it cannot be changed because it is val, not var")
  println("v3 has the value of ${v3} and it cannot be changed because it is val, not var")

  //05: Standard opertaoin like ++, --, etc can be done
  println("v2 has the value of ${v2}, v2-- will be ${v2--}")
  println("Now v2 has the value of ${v2}, --v2 will be ${--v2}")
  println("Now v2 is of the value ${v2}")

  //06: Auto type casting is not provided
  //var v4 = 5
  //var v5 : Long = v4 //Type mismatch: inferred type is Int but Long was expected
  //var v6 : Long = 5
  //var v7 : Int = v6 //Type mismatch: inferred type is Long but Int was expected
  
  //07: ? is used to signal that null is allowed for a variable
  var bTest1 : Boolean?
  bTest1 = false
  println("bTest1 is $bTest1")
  bTest1 = null 
  println("bTest1 is $bTest1")
  var bTest2 : Boolean
  bTest2 = false
  println("bTest2 is $bTest2")
  //bTest2 = null //Compile error: Null can not be a value of a non-null type Boolean
  //println("bTest2 is $bTest2")
}
