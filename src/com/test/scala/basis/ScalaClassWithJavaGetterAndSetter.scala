package com.test.scala.basis

import scala.reflect.BeanProperty

/**
  * Created by Chester on 2016/12/19.
  */
class ScalaClassWithJavaGetterAndSetter[T] {

  @BeanProperty val a: Int = 0
}
object ScalaClassWithJavaGetterAndSetter{

  def main(args: Array[String]) {
    val c = ScalaClassWithJavaGetterAndSetter
    println(c)
  }
}
