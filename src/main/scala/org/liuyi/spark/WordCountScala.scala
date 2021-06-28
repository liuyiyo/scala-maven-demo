package org.liuyi.spark

import org.apache.spark.{SparkConf, SparkContext}

object WordCountScala {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf()
    conf.setAppName("wordCount")
    conf.setMaster("local")
    val sc = new SparkContext(conf)
    //单词统计
    //dataset
    val fileRDD = sc.textFile("data/testdata.txt")
    //hello world
    val words = fileRDD.flatMap(x => x.split(" "))
    //hello
    //world
    val pairWord = words.map(x => Tuple2(x, 1))
    //(hello,1)
    //(world,1)
    val res = pairWord.reduceByKey(_ + _)

    val fanzhuan = res.map(x => (x._2, 1))
    val resOver = fanzhuan.reduceByKey(_ + _)
    resOver.foreach(println)
    res.foreach(println)


    Thread.sleep(Long.MaxValue)

  }

}
