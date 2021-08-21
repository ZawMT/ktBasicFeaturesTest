fun main(args: Array<String>) {
    //01: Collection Set
    val setTest = setOf(1,2,3,7,11)
    println(setTest) //[1, 2, 3, 7, 11]
    println(setTest::class) //class LinkedHashSet
    println(setTest.size) //5
    println(setTest.elementAt(4))//11

    //02: Collection Map
    val mapTest = mapOf("key1" to "Value One", "key2" to "Value TWO")
    println(mapTest) //{key1=Value One, key2=Value TWO}
    println(mapTest::class) //class LinkedHashMap
    println(mapTest.size) //2
    //It will handly the uniqueness of key
    val mapTest2 = mapOf("key1" to "Value One", "key1" to "1111")
    println(mapTest2) //{key1=1111}

    //03: Introduction to lambda
     val expressionLambda = { println("This is a print from Lambda Expression!") }
    expressionLambda.invoke() //This is a print from Lambda Expression!
}
