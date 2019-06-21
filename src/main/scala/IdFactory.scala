object IdFactory {
  private var counter = 0

  def id: Int = {
    counter += 1
    counter
  }

}
