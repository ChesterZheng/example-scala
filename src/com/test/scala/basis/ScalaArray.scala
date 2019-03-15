package com.test.scala.basis

import scala.collection.mutable.ArrayBuffer

/**
  * Scala数组
  * Created by Chester on 2016/12/14.
  */
class ScalaArray {

}

object ScalaArray extends App{

  val arr = new Array[Int](5)
  println(arr.length)

  //没写new的Array是调用Array的apply方法创建数组
  val arr1 = Array(1,2,3,4,5)
  println(arr1.toBuffer)

  //替换现有数组中的一个元素
  arr1.update(2,100)
  println(arr1.toBuffer)

  val arr2 = ArrayBuffer[Int]()
  //向末尾追加一个元素
  arr2 += 1
  println(arr2.toBuffer)
  //从末尾删除一个元素
  arr2 -= 1
  println(arr2.toBuffer)

  var arr3 = arr1++arr2
  println(arr3.toBuffer)

  //在原有数组基础上合并另一个数组
  arr3++=Array(6,7,8)
  println(arr3.toBuffer)

  val arr4 = arr3++:Array(9,10)
  println(arr4.toBuffer)

  println(arr4.diff(arr3).toBuffer)

  println(arr4.sum)
  println(arr4.max)
  println(arr4.sorted.toBuffer)

}
