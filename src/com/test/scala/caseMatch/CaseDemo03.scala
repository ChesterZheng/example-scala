package com.test.scala.caseMatch

/**
  * 模式匹配（可匹配数组中的元素）
  * 匹配原则，自上而下，若有匹配的组合，则结束
  * Created by Chester on 2017/8/15.
  */
object CaseDemo03 extends App {

  println("Case Match For Array")
  val arr = Array(0, 1, 7, 0)
  arr match {
    case Array(1, 5, x, y) => println(x + " " + y)
    case Array(1, 1, x, y) => println("only 0")
    case Array(0, _*) => println("0...")
    case _ => println("something else")
  }

  println("Case Match For List")
  val list = List(0, 1)
  list match {
    case 0 :: Nil => println("only one element")
    case x :: y :: Nil => println(s"x=$x y=$y")
    case 0 :: a => println(s"0...$a")
    case _ => println("something else")
  }

  println("Case Match For Tuple")
  val tuple = (6, 3, 5)
  tuple match {
    case (1, x, y) => println(s"hello $x, $y")
    case (_, z, 5) => println(z)
    case _ => println("something else")
  }

}
