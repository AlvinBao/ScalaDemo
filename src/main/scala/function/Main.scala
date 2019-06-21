package function

object Main {
  def main(args: Array[String]): Unit = {
    val f1 = new Function1[Int, Int] {
      override def apply(v1: Int): Int = {
        v1 * v1
      }
    }

    print(f1(10))
  }
}
