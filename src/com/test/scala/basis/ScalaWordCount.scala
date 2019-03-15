package com.test.scala.basis

/**
  * Created by Chester on 2016/12/14.
  */
class ScalaWordCount {

}

object ScalaWordCount extends App {

  /**
    *val lines = List("Hello Tom Hello Jerry","Hello Jerry","Hello Kitty")
    * 先按空格切分，再压平
    */
  val lines = List("Hello Tom Hello Jerry","Hello Jerry","Hello Kitty")
  val newLine = lines.flatMap(_.split(" "))
  println(newLine)

  val xs = Map("a" -> List(11,111), "b" -> List(22,222)).flatMap(_._2)
  println(xs)

  val ys = Map("a" -> List(1 -> 11,1 -> 111), "b" -> List(2 -> 22,2 -> 222)).flatMap(_._2)
  println(ys)

}
