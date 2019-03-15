package com.test.scala.basis

/**
  * Scala定义变量，常量，私有变量
  */
class ScalaDefineVariable {

  //定义常量，相当于Java中final修饰的常量
  val param: Int = 1
  println(param)

  //定义变量
  var name: String = "tom"
  println(name)
  name = "jerry"
  println(name)

  //定义私有变量(只能在本类和本类的伴生对象中被访问)
  private val id: Int = 1
  println(id)

  //定义私有变量(只能在本类中使用)，相当于Java中的private int age
  private[this] val age: Int = 20
  println(age)

}

object ScalaDefineVariable extends App {

  val sb = new ScalaDefineVariable()

  println("param=" + sb.param)
  println("id=" + sb.id)
  println("name=" + sb.name)


}
