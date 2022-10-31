object Main extends App {
  println("First, create a decision tree indicating a different series of conditions to be checked.")
  //here we want to determinate if a user is able to cross or not the road according to traffic fires
  var color:String = ""
  var carsComing:Int = 0
  if(color == "red")
    println("Do not cross")
  else if (color == "orange"  && carsComing == 0)
    println("hurry up to cross")
  else println("Cross")

  var crossing:String = if (color == "red") "Do not cross" else if (color == "orange" && carsComing== 0) "hurry up" else "cross"

  var size = 1.75
  size match{
    case x if x > 1.80 => "tall"
    case y if y < 1.70 => "short"
    case z if z>= 1.70 && z <= 1.80 => "normal size"
  }


}




