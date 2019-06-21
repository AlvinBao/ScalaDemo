package mixins

trait BaseIterator {
  type T

  def hasNext: Boolean

  def next: T
}
