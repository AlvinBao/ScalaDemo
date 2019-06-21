import scala.util.Random


object CustomerID {
  def apply(name: String): String = s"$name--${Random.nextLong}"

  def unapply(id: String): Option[String] = {
    val parts = id.split("--")
    if (parts.length == 2) {
      Some(parts(0))
    } else {
      None
    }
  }

}


object Main {
  def main(args: Array[String]): Unit = {
    val customerID = CustomerID("xianqinag.bao")

    customerID match {
      case CustomerID(name) => println(name)
      case _ => println("No match")
    }
  }
}

