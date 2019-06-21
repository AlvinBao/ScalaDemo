class Greeter(prefix: String, suffix: String) extends GreeterTrait {

  override def greet(name: String): String = prefix + " " + name + " " + suffix

}
