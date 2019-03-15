package com.test.scala.basis

import scala.collection.{SortedMap, mutable}

/**
  * Created by Chester on 2016/12/14.
  */
class ScalaMap {

}

object ScalaMap extends App {

  //创建映射，相当于Java中的Map
  val map = Map("a" -> 1, "b" -> 2, "c" -> 3)
  println(map.toBuffer)

  //使用“元组”创建映射
  val map1 = Map(("x", 1), ("y", 2), ("z", 3))
  println(map1.toBuffer)

  //向map中追加(k,v)对，并生成一个新的map返回
  val map2 = map +("d" -> 4, "e" -> 5)
  println(map2.toBuffer)

  //map和map合并
  val map3 = map1 ++ map2
  println(map3.toBuffer)

  /**
    * 使用getOrElse
    * 当map中没有指定的元素，返回自定义信息
    */
  println(map3.getOrElse("d", "error"))

  val map4 = Map("a" -> 1)
  val map5 = Map("b" -> 1)

  //拼接Map
  val map6 = map4 ++: map5
  println(map6.toBuffer)
  val map7 = map5 ++: map4
  println(map7.toBuffer)

  val map8 = mutable.ListMap("a" -> 1, "b" -> 2, "c" -> 3, "d" -> 4, "e" -> 5)
  println(map8.toBuffer)

  val map9 = SortedMap("d" -> 4, "b" -> 2, "c" -> 3, "a" -> 1, "e" -> 5)
  println(map9.toBuffer)

}