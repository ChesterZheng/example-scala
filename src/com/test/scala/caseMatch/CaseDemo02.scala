package com.test.scala.caseMatch

/**
  * 模式匹配（可匹配不同数据类型）
  * Created by Chester on 2017/8/15.
  */
object CaseDemo02 extends App {

  val arr = Array("hello", 1, -2.0, CaseDemo02)

  val element = arr(2)

  element match {
    case x: Int => println("Int "+ x)
    case y: Double if y >= 0 => println("Double "+ y)
    case z: String => println("String "+ z)
    case CaseDemo02 => {
      println("This is CaseDemo02")
    }
    case _ => {
      println("Unknown")
    }
  }
}
