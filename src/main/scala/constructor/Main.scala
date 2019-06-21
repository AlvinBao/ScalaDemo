package constructor

object Main {
  def main(args: Array[String]): Unit = {
    val p = new Person
    val p1 = new Person1("bao", "xian", "qiang")
    println(p1.firstName)
    println(p1.age)
  }
}
