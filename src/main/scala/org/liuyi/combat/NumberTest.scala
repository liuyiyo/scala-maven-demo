package org.liuyi.combat

import scala.util.Random

class NumberTest {

}
object NumberTest{
  def main(args: Array[String]): Unit = {
    val a = 10000L
    println(a.isValidByte)
    println(a.isValidShort)

    val b = 0x20
    println(b)

    //+=不是操作符号而是Int的方法
    var c = 1
    c +=1
    println(c)

    val d = 0.1+0.2
    println(d)

    var bigInt = BigInt(12345678901L)
    var bigDecimal = BigDecimal(1234567890)
    println(bigInt.isValidInt)
    println(Byte.MaxValue)
    println(Short.MaxValue)
    println(Int.MaxValue)
    println(Long.MaxValue)
    println(Double.MaxValue)

    //生成随机数
    val random = new Random
    println(random.nextInt(100))

    //创建区间
    val r = 1 to 10


  }
}
