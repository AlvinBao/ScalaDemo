package apply

class People(val name: String, var age: Int, val gender: String) {

}

// extractor object
object People {
  def apply(name: String, age: Int, gender: String): People = new People(name, age, gender)

  /**
    * Option[T]
    * Option[(T1, T2, T3)]
    * Boolean
    * Option[Seq[T]]
    *
    * @param arg
    * @return
    */
  def unapply(arg: People): Option[(String, Int, String)] = {
    if (arg == null) None else Some((arg.name, arg.age, arg.gender))
  }
}
