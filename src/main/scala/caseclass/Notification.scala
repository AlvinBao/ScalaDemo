package caseclass

abstract class Notification

case class Email(var rom: String, to: String, title: String) extends Notification

case class SMS(from: String, body: String) extends Notification

case class VoiceRecording() extends Notification

