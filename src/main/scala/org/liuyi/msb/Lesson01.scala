package org.liuyi.msb

/**
 * 流程控制
 */
object Lesson01 {

  def main(args: Array[String]): Unit = {
    var a = 3
    if(a<3){
      println(s"$a<3")
    }else{
      println(s"$a>=3")
    }
    var aa = 0
    while (aa<10){
      println(aa)
      aa+=1
    }

    println("--------------------------")
    //until不包含末尾值，to包含
    val seqs = 1 until 10
    println(seqs)

    //可以加if条件
    for(i <- seqs if(i%2==0)){
      println(i)
    }

    //打印99乘法表
    for(i <- 1 to 9;j <- 1 to 9 if(j<=i)){
        print(s"$i * $j = ${i*j}\t")
        if(j==i) println()
    }
  }
}
