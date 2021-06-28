package org.liuyi.msb


trait God{
  def day(): Unit ={
    println("god...say")
  }
}

trait Mg{
  def ku(): Unit ={
    println("mg...say")
  }
  def hairen()
}

class Person(name:String) extends God with Mg {
  def hello(): Unit ={
    println(s"$name")
  }

  override def hairen(): Unit = {
    println("hairen")
  }
}
object Lesson_trait {
  def main(args: Array[String]): Unit = {
    val ly = new Person("ly")
    ly.hello()
    ly.day()
    ly.ku()
    ly.hairen()
  }
}
