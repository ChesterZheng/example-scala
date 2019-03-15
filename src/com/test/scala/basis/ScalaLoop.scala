package com.test.scala.basis

/**
  * Scala各种样式的循环
  * 1.支持for()中带条件判断
  */
class ScalaLoop {

}

object ScalaLoop extends App {

  val arr = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

  for (i <- arr) print(i + "\t")
  println()

  for (i <- arr.reverse) print(i + "\t")
  println()

  for (i <- arr if i % 2 == 0) print(i + "\t")
  println()

  for (i <- 1 to 10) print(i + "\t")
  println()

  for (i <- 1 until 10) print(i + "\t")
  println()

  for (i <- arr; j <- 1 to 3 if i != j && i % 2 == 0) print(i + "\t")
  println()

  val map = Map("a" -> 1, "b" -> 2, "c" -> 3)

  for (i <- map) print("key=" + i._1 + ",value=" + map.get(i._1).get + "\t")
  println()

  var i = 0
  while (i < 10) {
    print(i + "\t")
    i += 1
  }

}
