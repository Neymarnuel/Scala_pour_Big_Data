object Main extends App {
  println("");
  println("CHAPTER 4");
  println("");

  println("try creating a variable of type Double and assigning an integer value to it. Does it work?");
  var doub1:Double = 3;
  println("yes it worked");
  println("");
  println(" Do it the other way (storing a Double value in an Integer variable)");
  var intVar1:Int = 3.0;
  println("It does not worked");
  println("");
  println(" by pass by value and pass by reference")
  var x:Int = 10
  var y:Int = x
  x = 12
  println("after changing the value of x, y value has not changed")
  prinln("The difference between pass-by-reference and pass-by-value is that modifications made to arguments passed in by " +
    "reference in the called function have effect in the calling function, whereas modifications made to arguments passed in " +
    "by value in the called function can not affect the calling function")
  
  println("")
  println("Create multiple variables in one line")
  var(g:Int,h:Double,i:String) = (4,5.2,"Hi")

}