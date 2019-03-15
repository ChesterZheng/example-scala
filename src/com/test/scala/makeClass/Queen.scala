package com.test.scala.makeClass

/**
  * 类名后面加“private” 来设置此类对构造器的访问权限
  * Created by Chester on 2017/8/9.
  */
class Queen private (val name: String, prop: Array[String], private var age: Int = 18){


}

/**
  * 在class前面加“private[package]”来设置此类对包的访问权限
  */
private[test] class Test {

}
