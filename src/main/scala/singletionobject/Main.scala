package singletionobject


object Main {
  def main(args: Array[String]): Unit = {
    println(Earth.area)
    Earth.fly
    println(Earth.toString)
    println(Earth.isInstanceOf[Serializable])
  }
}
