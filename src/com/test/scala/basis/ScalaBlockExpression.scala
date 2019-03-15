package com.test.scala.basis

/**
  * Scala块表达式
  */
class ScalaBlockExpression {

}

object ScalaBlockExpression extends App{

  val x = 0

  val result = {
    val x: Int = 1
    if(x==1){
      println("this is If-condition")
      1
    }else if(x >1){
      println("this is else-if condition")
      "x>1"
    }else{
      println("this is else-condition")
      "x<1"
    }
  }

  println(result)
}
