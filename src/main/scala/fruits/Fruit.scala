package fruits

case class Fruit(name: String, color: String)

object Apple extends Fruit("apple", "red")
object Plum extends Fruit("plum", color = "yellow")
object Banana extends Fruit("banana", color = "yellow")
