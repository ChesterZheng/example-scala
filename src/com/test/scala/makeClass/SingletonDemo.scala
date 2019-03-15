package com.test.scala.makeClass

/**
  * object表示一个单例对象
  * 1.存放工具方法和常量
  * 2.高效功效单个不可变的实例
  * 3.单例模式
  * Created by Chester on 2017/8/9.
  */
object SingletonDemo {

  private val t = 123

  def sayHi(): Unit ={
    println("hi")
  }

  def main(args: Array[String]) {

    val s1 = SingletonDemo.sayHi()
    println(s1)

    val s2 = SingletonDemo
    println(s2)

    val s3 = new SingletonDemo
    println(s3)

    val s4 = SingletonDemo
    println(s4)
  }
}

class SingletonDemo {

  println("new SingletonDemo")
}