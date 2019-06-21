package forloop

object Main {
  def main(args: Array[String]): Unit = {
    val names = Seq("bao1", "bao2", "bao3", "bao4")
    // for expression/for comprehension
    val temp = for {name <- names if name.endsWith("1") if true
    } yield {
      name.length
    }
    println(temp)
  }
}
