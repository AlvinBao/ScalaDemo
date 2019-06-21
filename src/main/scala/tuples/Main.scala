package tuples

object Main {
  def main(args: Array[String]): Unit = {
    // define
    val t1 = (1, 2)
    println(t1)
    // access
    println(t1._1)
    println(t1._2)
    // tuple can be used with pattern match
    val (first, second) = t1
    val numPairs = List((1, 2), (2, 3), (3, 4))
    for ((a, b) <- numPairs) {
      println(a * b)
    }
  }
}
