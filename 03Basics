fun main(args: Array<String>) {
  //01: A basic format of a function
  println("fnPlus(3, 2) is ${fnPlus(3, 2)}")
  println("fnPlusShorter(3, 2) is ${fnPlusShorter(3, 2)}")

  //02: Default parameters
  println("fnIncrement(6) is ${fnIncrement(6)}") //Return value is 7
  println("fnIncrement(6,3) is ${fnIncrement(6,3)}") //Return value is 9

  //03: Named parameters
  val valUser = "User1"
  val valYear = "2021"
  var valMonth : String? = "01"
  var valDay : String? = "02"
  val valDayOfWeek = "2"
  println(fnGenerateUserName(valUser, valYear, valMonth, valDay, valDayOfWeek)) //User12021M01D02W2
  
  valMonth = null
  println(fnGenerateUserName(valUser, valYear, valMonth, valDay, valDayOfWeek)) //User12021D02W2
  
  println(fnGenerateUserName(userName = "User2", dobDayOfWeek="01")) //User21900W01
  println(fnGenerateUserName(dobDayOfWeek="01", userName = "User2")) //User21900W01
}

//For 01
fun fnPlus(p1: Int, p2: Int) : Int {
  return p1 + p2
}

//For 01
fun fnPlusShorter(p1: Int, p2: Int) = p1 + p2
//For 01
//If the return type is to be defined explicitly, it can be done as follows, the latter might be more logical
//fun fnPlusShorter(p1: Int, p2: Int) : Long = (p1 + p2).toLong()
//or
//fun fnPlusShorter(p1: Int, p2: Int) : Long = p1.toLong() + p2.toLong()

//For 02:
fun fnIncrement(p1: Int, pDelta: Int = 1) : Int {
  return p1 + pDelta
}

//For 03:
fun fnGenerateUserName(userName: String, dobYear: String = "1900", dobMonth: String? = null, dobDay: String? = null, dobDayOfWeek: String) : String {
  if(dobMonth == null && dobDay == null) 
    return userName + dobYear + "W" + dobDayOfWeek
  else if(dobMonth == null)
    return userName + dobYear + "D" + dobDay + "W" + dobDayOfWeek
  else if(dobDay == null)
    return userName + dobYear + "M" + dobMonth + "W" + dobDayOfWeek
  else
    return userName + dobYear + "M" + dobMonth + "D" + dobDay + "W" + dobDayOfWeek
}
