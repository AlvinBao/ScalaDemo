package mixins

trait RichIterator extends BaseIterator {
  def foreach(f: (T) => Unit): Unit = {
    while (hasNext) {
      f(next)
    }
  }
}
