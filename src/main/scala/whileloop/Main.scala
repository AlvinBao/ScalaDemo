package whileloop

object Main {
  def main(args: Array[String]): Unit = {
    var x = 1
    while (x < 10) {
      println(x)
      x += 1
    }


    do {
      println(x)
      x -= 1
    } while (x > 0)
  }

}