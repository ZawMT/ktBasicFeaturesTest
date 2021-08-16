fun main(args: Array<String>) {
  println("Hello world!") //01: Printing something on the screen

  HelloWorld().sayHello() //02: Kotlin class and object 

  //03: Some basic data types and type casting
  //Output will depend on the running environment
  println(1234::class) //Output => class kotlin.Int
  println(1234L::class) //Output => class kotlin.Long
  println(1.234::class) //Output => class kotlin.Double
  println(1.234f::class) //Output => class kotlin.Float

  //04: _ can be used for readable separator
  println(123_4::class) //Output => class kotlin.Int
  println(123_456_789::class) //Output => class kotlin.Int
  println(1234_5678_9012::class) //Output => class kotlin.Long
  //The following will cause a compilation error
  //Unresolved reference _123_4
  //println(_123_4::class) 
  //The following will cause a compilation error
  //Illegal underscore
  //println(123_4_::class) 
  //?How about this?
  //println(_123_4_::class) => Unresolved reference _123_4_

  //05: Escape characters are printed using backslash
  println("Hello \n World \$\\")
  //Or triple quoted string will allow the embedded escape characters
  println("""Hello 
  World $\""")
}

//For 02
class HelloWorld {
  fun sayHello(){
    println("Hello from HelloWorld class!")
  }
}
