package com.test.scala.test

import scala.collection.mutable
/**
  * Created by Chester on 2017/11/2.
  */
object TestHashSet {

  def main(args: Array[String]) {

    val set = new mutable.HashSet[(String, Long, Long)]()
    for (i <- 1 to 5) {
      val t = ("123", 0L, 0L)
      set += t
    }

    for (s <- set) {
      println(s._1+"="+s._2+"="+s._3)
    }

  }
}
