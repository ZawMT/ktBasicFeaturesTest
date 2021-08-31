fun main() {
    //Filter vs Map
    val txts = listOf("abc", "cd", "efg", "hi", "jkl")
    txts.filter {
    val hasVowel = it.contains("a") || it.contains("e") || it.contains("i") || it.contains("o") || it.contains("u")  
    it.toUpperCase() //This will have no effect
    hasVowel
    }.forEach { println(it) } //abc, efg, hi will printed
  
    txts.map {
      it.toUpperCase()
    }.forEach { println(it) } //ABC, CD, etc, all, will be printed
}
