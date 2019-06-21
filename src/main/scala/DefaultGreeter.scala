class DefaultGreeter extends GreeterTrait with Iterator[Int] {
  override def hasNext: Boolean = true

  override def next: Int = 0
}
