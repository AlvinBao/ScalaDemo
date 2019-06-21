
package object fruits {
  val fruits = List(Apple, Plum, Banana)

  def show(fruit: Fruit): Unit = {
    println(s"${fruit.name}'s color is ${fruit.color}")
  }
}
