object Main extends App {
  println("Numeric types in scala")
  println("Int: memory location of 4 bytes; ranges from -2147483648 to 2147483647")
  println("Short: memory location of 2 bytes.; ranges from -32768 to 32767")
  println("Long: memory location of 8 bytes; ranges from -9223372036854775808 to 9223372036854775807")
  println("Float: memory location of 4 bytes;  ranges from -3.4E+38 to +3.4E+38 i.e. single precision")
  println("Double:  memory location of 8 bytes;  ranges from IEEE 754 double-precision float")
  println:("")
  println("Functions available for Integer type have been presented in chapter 3")
  println("priority between operators in scala are the same as in mathematics, so we have at the top in priority" +
    "order exponents, after parenthesis, then multiplication, and finally addition")

  println("the different types of logical operators available in scala: <, >, <=, >=, |, &&") 
  println("");
  println("when we assign a boolean to an integer we have the following error: error: type mismatch; found : Boolean(true) " +
    "required: Int z = true")
  println("It is impossible to add boolean in scala. We have a mismatch type error")

  var z:Int = 10; var dec:Boolean = true;
  z.toString; dec.toString();
  println(z)+ " and "+dec; 
  println("We do not have any error by converting Int of Boolean to String")

  println()
  var a:Double = 10.5
  a.toInt
  println(a)
  println("we do not have any problem by converting Double to Int")

  var b:Int = 10
  b.toInt
  println(ln)
  println("we do not have any problem by converting Int to Int")

  var c:String = "Two"
  println("It does not work when we try to convert String to Int")

}