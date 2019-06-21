class Stack[A] {
  private var elements: List[A] = Nil

  def push(x: A): Unit = {
    elements = x :: elements
  }

  def pop(): A = {
    val top = elements.head
    elements = elements.tail
    top
  }

  def peek: A = elements.head

  def isEmtpy: Boolean = {
    elements.isEmpty
  }
}
