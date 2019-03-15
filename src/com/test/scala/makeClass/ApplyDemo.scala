package com.test.scala.makeClass

/**
  * Created by Chester on 2017/8/9.
  */
class ApplyDemo {


}

/**
  * 单例对象的Apply方法
  *
  * 调用apply方法时，
  * 会自动根据参数个数和参数类型调用对应的伴生对象中的apply方法
  */
object ApplyDemo {

  def apply(): Unit = {
    println("apply method invoked")
  }

  def main(args: Array[String]) {

    val a = ApplyDemo("TOM")
    println(a)

    val b = ApplyDemo(100)
    println(b)
  }

  def apply(name: String): Unit = {
    println(name)
  }

  def apply(age: Int): Int = {
    age
  }


}
