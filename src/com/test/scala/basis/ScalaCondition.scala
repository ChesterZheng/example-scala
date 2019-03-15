package com.test.scala.basis

/**
  * Scala条件表达式
  * 1.支持混合类型
  */
class ScalaCondition {


}

object ScalaCondition extends App {

  val x: Int = 1

  if(x==1){
    println("this is If-condition")
  }else if(x >1){
    println("this is else-if condition")
  }else{
    println("this is else-condition")
  }

  //if支持混合类型
  val y = if(x > 1) 1 else "error"
  println(y)

  //如果else缺失
  val z = if(x > 1) 1
  println(z)

}
