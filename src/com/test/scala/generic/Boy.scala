package com.test.scala.generic

/**
  * 定义泛型类
  */
class Boy (val name:String, var faceValue: Int) extends Comparable[Boy]{

  override def compareTo(o: Boy): Int = {
    this.faceValue - o.faceValue
  }
}

