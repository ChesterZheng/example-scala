package com.test.scala.test

import scala.collection.mutable.ArrayBuffer

/**
  * Created by Chester on 2017/11/1.
  */
object TestArray {

  def main(args: Array[String]) {
//    val a: Array[Int] = Array(1,2,3,4,5,6,7,8,9,10)
//
//    val partition: (Array[Int], Array[Int]) = a.partition(_ % 2 ==0)
//
//    println(partition._1.toBuffer)
//    println(partition._2.toBuffer)

    val a: ArrayBuffer[(String, Long, Long)] = new ArrayBuffer[(String, Long, Long)]()
    val t = ("123",0L,0L)
    a+= t

    println(a)
  }
}
