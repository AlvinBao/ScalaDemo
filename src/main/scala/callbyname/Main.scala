package callbyname

object Main {
  def main(args: Array[String]): Unit = {
    val x:Unit = ""
    println(x)
    doItWithFunction(() => 1)
    doIt {
      1
    }
  }

  def sum(x: Int, y: Int): Int = {
    println("sum is executed")
    x + y
  }


  def doIt(x: => Unit): Unit = {
    ""
  }


  def doItWithFunction(x: () => Int): Unit = {
    x
  }
}
