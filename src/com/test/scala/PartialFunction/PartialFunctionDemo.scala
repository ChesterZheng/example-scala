package com.test.scala.PartialFunction

/**
  * Created by Chester on 2017/8/15.
  */
object PartialFunctionDemo extends App {

  //PartialFunction[String, String]
  //第一个参数代表入参，第二个参数代表返回值
  //在Scala中，有一对大括号并且有case语句但没有match的叫做偏函数
  //PartialFunction[-A, +B]
  //-A：逆变：代表方法的输入
  //+B：斜变：代表方法的返回
  def fun1: PartialFunction[String, String] = {
    case "world" => "hello world"
    case "zhangsan" => "hello zhangsan"
    case _ => "something else"
  }

  def fun2(num: String) : Int = num match {
    case "one" => 1
    case "two" => 2
    case _ => -1
  }


  println(fun1("world"))
  println(fun2("two"))

}
