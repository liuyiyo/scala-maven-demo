package org.liuyi.combat

import scala.util.control.Breaks.{break, breakable}

class ControlTest {

}
object ControlTest{
  val a  = Array("apple","bannana","orange")

  def main(args: Array[String]): Unit = {
    val array = for(e <- a) yield{
      e.toUpperCase
    }
    array.foreach(println)

    for(i <- 0 to (a.length-1)){
      println(a(i))
    }
    for(i <- 1 to 10 if i>5 if i%2==0){
      println(i)
    }

    println("break demo")
    breakable{
      for (i <- 1 to 10){
        println(i)
        if(i > 6) break
      }
    }

    println("continue demo")
    for(i <- 1 to 10){
      breakable{
        if(i%2==0) break()
        println(i)
      }
    }
    //像三元符一样使用if

    val c = 0
    val d = if (c==0) "a" else "b"
    println(s"d===$d")

    val i = 1;
    def month(i:Int) = i match {
      case 1 => true
      case 0 => false
    }
    println(month(i))

  }
}
