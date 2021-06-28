package org.liuyi.msb

//match switch
object Lesson_match {
  def main(args: Array[String]): Unit = {
    val tuple = (1.2, 88, "abc", false, 'a')
    val iterator = tuple.productIterator
    iterator.map(x=>{x match {
      case o:Int => println(s"$o  $x is int")
      case _ => println("我也不知道啥类型")
    }})
  }
}
