class Point {
  private var _x = 0
  private var _y = 0

  def x: Int = _x

  def x_=(newX: Int): Unit = {
    _x = newX
  }

  def y: Int = _y

  def y_=(newY: Int): Unit = {
    _y = newY
  }
}
