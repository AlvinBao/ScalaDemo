package caseclass

object Main {
  def main(args: Array[String]): Unit = {
   notify(SMS("from", "title"))
  }

  def notify(notification: Notification): Unit = {
    notification match {
      case email: Email => println("it's an email")
    }
  }
}
