package constructor

class Person1(val firstName: String, var middleName: String, lastName: String) {
  println("primary constructor start")
  val age: Int = 10
  var height: Int = 0

  override def toString: String = {
    s"""
       |firstName:$firstName
       |middleName:$middleName
       |lastName:$lastName
       |age:$age
       |height:$height
     """.stripMargin
  }

  println("primary constructor end")
  println(this.toString)


  def this(firstName: String, lastName: String) {
    this(firstName, "", lastName)
    println("auxiliary constructor")
  }
}
