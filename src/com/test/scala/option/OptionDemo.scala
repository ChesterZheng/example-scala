package com.test.scala.option

/**
  * Created by Chester on 2017/8/15.
  */
object OptionDemo extends App {

  val m = Map("a" -> 1, "b" -> 2)

  val r = m.getOrElse("c", -1)

  println(r)
}
