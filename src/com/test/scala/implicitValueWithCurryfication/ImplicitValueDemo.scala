package com.test.scala.implicitValueWithCurryfication

/**
  * Created by Chester on 2016/12/16.
  */
object Context {

  implicit val a: Int = 1024

//  implicit val b: Int = 2048
}

object ImplicitValueDemo {

  def m(x: Int)(y: Int) = x * y

  //implicit修饰的变量可从自定义的隐式转换“门面”中寻找对应数据类型的变量值
  def m1(x: Int)(implicit y: Int = 100) = x * y

  def main(args: Array[String]) {

    val result = m(2)(4)
    println(result)
    val result2 = m1(2)
    println(result2)

    /**
      * 【注意】
      * 以下这种情况
      * 使用自定义的Object时
      * Scala会优先寻找你自定义的Object中是否有与将要使用的参数“类型一致”的变量
      * 【注意注意注意】：只需要是类型一样，跟变量名称无关！！！
      *
      * Scala寻找implicit修饰的变量的优先级：自定义的Object > 方法中的implicit变量
      *
      * 当导入的Object中(无论是一个Object，还是多个Object)
      * 参数类型相同的参数多于一个，会报错
      * 报错信息: ambiguous implicit values
      */
    import Context._
    val result3 = m1(2)
    println(result3)

  }
}

