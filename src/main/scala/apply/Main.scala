package apply

object Main extends App {

  val p1 = People("xianqiang.bao", 28, "male")
  p1 match {
    case People(name, _, _) => println(name)
    case _ => println("match failed")
  }
}
