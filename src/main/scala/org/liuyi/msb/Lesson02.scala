package org.liuyi.msb

import java.util.Date

/**
 * 函数
 */
object Lesson02 {
  //方法
  def fun01(): Unit ={
    println("Hello world")
  }

  //参数必须是val的，不能被修改
  def fun02(a:Int){
    println(a)
  }

  def fun03(num:Int): Int ={
    if(num==1) {
      num
    }else{
      num * fun03(num-1)
    }
  }

  def fun04(a:Int=8,b:String="testS"): Unit ={
    println(s"$a $b")
  }

  def main(args: Array[String]): Unit = {
    fun01()

    //递归函数
    println(fun03(1))

    //默认值函数
    fun04(20)
    fun04(b="ssss")

    //匿名函数
    var ab = (a:Int,b:Int)=>{
      a+b
    }
    println(ab(3,4))

    //偏应用函数
    def fun07(date:Date,tp:String,msg:String): Unit ={
      println(s"$date\t$tp\t$msg")
    }
    fun07(new Date(),"info","ok")
    var info = fun07(_:Date,"info",_:String)
    info(new Date(),"OK")

    //可变参数
    def fun08(a:Int*): Unit ={
//      a.foreach((i:Int)=>{
//        println(i)
//      })
//      a.foreach(println(_))
      a.foreach(println)
    }
    fun08(1,2,3)

    //函数作为参数
    def computer(a:Int,b:Int,f:(Int,Int)=>Int): Unit ={
      println(f(a,b))
    }
    computer(3,8,(a,b)=>a*b)
    //语法糖
    computer(3,8,_*_)

    //函数作为返回值
    def factory(i:String):(Int,Int)=>Int={
      if(i.equals("+")){
        _+_
      }else{
        _*_
      }
    }
    //柯里化
    def fun9(a:Int)(b:Int)(c:String): Unit ={
      println(s"$a\t$b\t$c")
    }

    def fun10(a:Int*)(b:String*): Unit ={
      a.foreach(println)
      b.foreach(println)
    }

    fun10(5,24,4)("fsdg","sdgsd")

    //方法不想执行，赋值给一个引用 _ 方法名+空格+下划线
    val fun = fun02 _




  }


}
