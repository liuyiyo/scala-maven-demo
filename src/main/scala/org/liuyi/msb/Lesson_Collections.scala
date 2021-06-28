package org.liuyi.msb

import scala.collection.mutable.ListBuffer

/**
 * 集合
 */
object Lesson_Collections {
  def main(args: Array[String]): Unit = {
    println("-----------数组----------------")
    val array01 = Array[Int](1, 2, 3, 4)
    array01.foreach(println)
    println("-----------链表----------------")
    //scala中collections中有两个包：immutable和mutable 默认是不可改变的immutable
    //不可改变
    val list01 = List(1,2,3,4,5,6)
    list01.foreach(println)
    //可变
    val list02 = new ListBuffer[Int]
    list02.+=(1)
    list02.+=(2)
    list02.+=(3)
    list02.foreach(println)
    //学习scala数据集中的+= ++ ++: :++  等等操作
    println("-----------set----------------")
    val set01 = Set(1, 5, 8, 9, 9, 5)
    set01.foreach(println)
    import scala.collection.mutable.Set
    val set02 = Set(23, 32423, 32, 234, 23, 42, 34, 23, 4, 2)
    set02.add(5565)
    set02.foreach(println)
    println("-----------tuple----------------")
    val tuple01 = new Tuple2(0, "gfsdg")
    val tuple02 = Tuple3(0, "sds", "sdgsd")
    val tuple03 = (1, 52, "sdg", "sdg")

    println("-----------Map----------------")
    //不可变的
    val map01 = Map(("a", 1), "b" -> 2)
    val keys: Iterable[String] = map01.keys
    println(map01.get("a").getOrElse(554))
    println(map01.get("c").getOrElse(554))
    //可变的
    val map02 = scala.collection.mutable.Map(("a", 1), "b" -> 2)
    map02.put("c",535)

    println("-----------艺术----------------")

    val list = List(1,2,3,4,5,6)
    val list1 = list.map(_ + 10)
    list1.foreach(println)

    println("-----------艺术-升华----------------")

    val listStr = List("hello world", "hello ly", "good idea")
    val listStr2 = listStr.flatMap(_.split(" "))
    listStr2.foreach(println)
    val mapList = listStr2.map(str => (str, 1))
    mapList.foreach(println)

    println("-----------艺术-再升华----------------")
    // 什么是迭代器，为什么会有迭代器这个设计模式
    // 迭代器里面不存数据
    // 迭代器只能用一次，要继续使用，必须再获取一遍
    val iter = listStr.iterator
    val listStr3 = iter.flatMap(_.split(" "))
    listStr3.foreach(println)
    val mapList2 = iter.map(str => (str, 1))
    mapList2.foreach(println)
  }
}
