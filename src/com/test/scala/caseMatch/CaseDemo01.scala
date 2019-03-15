package com.test.scala.caseMatch

import scala.util.Random

/**
  * Created by Chester on 2017/8/15.
  */
object CaseDemo01 extends App {

  val arr = Array("zhangsan","lisi","wangwu")
  val name = arr(Random.nextInt(arr.length))

  println(name)

  name match {
    case "zhangsan" => println("张三")
    case "lisi" => println("李四")
    case _ => println("Who are u")
  }
}
