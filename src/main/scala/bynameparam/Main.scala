package bynameparam

object Main {
  def main(args: Array[String]): Unit = {
    var i = 0
    whileLoop(i < 10) {
      println(i)
      i += 1
    }
  }

  def whileLoop(condition: Boolean)(body: => Unit): Unit = {
    if (condition) {
      body
      whileLoop(condition)(body)
    }
  }
}
