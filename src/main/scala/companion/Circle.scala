package companion

import scala.math._

case class Circle(radius: Double) {
  import Circle._
  def area: Double = computeArea(radius)
}

object Circle {
  private def computeArea(radius: Double): Double = Pi * pow(radius, 2)
}

