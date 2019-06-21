class IntIterator(to: Int) extends Iterator[Int] {
  private var current = 0

  override def hasNext: Boolean = current < to

  override def next: Int = {
    if (!hasNext) {
      return -1
    }

    val result = current
    current += 1
    return result
  }
}
