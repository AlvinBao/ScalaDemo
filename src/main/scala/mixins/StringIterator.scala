package mixins

class StringIterator(s: String) extends BaseIterator with RichIterator {
  private var current = 0

  override type T = Char

  override def hasNext: Boolean = current < s.length

  override def next: T = {
    val result = s.charAt(current)
    current += 1
    result
  }
}
