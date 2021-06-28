package org.liuyi.combat

import scala.util.matching.Regex

class StringTest {

}

case class Student(name:String,score:Int)

object StringTest{
  def main(args: Array[String]): Unit = {
    val str = "hello world"
    "hello".foreach(println)
    for (c <- "hello"){
      println(c)
    }

    //创建多个字符串
    val foo = """This is
            a multiline
              String """
    println(foo)

    val speech =
      """four score and
        |seven years ago
        | our fathers""".stripMargin
    println(speech)

    //分割字符串
    val strings = "hello world".split(" ")
    strings.foreach(println)
    val s = "one, two, three, four, five";
    s.split(",").map(t => t.trim).foreach(println)

    //字符串中的变量代换
    val liuyi = new Student("liuyi", 90)
    println(s"${liuyi.name} has a score of ${liuyi.score+10}")
    //raw防止格式化
    println(raw"foo\nbar")

    //遍历并处理字符串
    str.filter(_!='l').map(_.toUpper).foreach(println)

    //字符串中查找
    val numPattern = "[0-9]+".r
    val address = "123 main street suite 101"
    var maybeString = numPattern.findFirstIn(address)
    println(maybeString.get)

    //字符串替换
    val str1 = address.replaceAll("[0-9]", "x")
    println(str1)

    //抽取String中模式匹配的部分
    val pattern  = "([0-9])".r
    val str2 = "100 Bananas 1245"
    pattern.findAllIn(str2).foreach(strings=>println(strings))

    //String类中添加自定义的方法
    implicit class StringImprovements(s:String){
      def include = s.map(c=>(c+1).toChar)
    }

    println("HAL".include)
  }
}

