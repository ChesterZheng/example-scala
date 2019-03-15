package com.test.scala.generic

/**
  * Scala泛型的使用
  * 1.在类上使用泛型
  * 2.在方法上使用泛型
  *
  * 语法：
  * 1.[T <: Class]规定上界
  * 2.[T >: Class]规定下界
  * 3.[T <% Class]视图界定
  * 4.[T : Class]上下文界定
  * [-T]通常作为方法的参数（入参）
  * [+T]通常作为方法的返回（出参）
  */
class MrRight[T <: Comparable[T]] {

  def choose(first: T, second: T): T = {
    if (first.compareTo(second) > 0) first else second
  }

  //在方法上使用泛型
  def choose[T <: Comparable[T]](first: T, second: T, third: T): T = {
    if (first.compareTo(second) > 0) first else second
  }

}

object MrRight {

  def main(args: Array[String]) {

    val mr = new MrRight[Boy]
    val b1 = new Boy("zhangsan", 80)
    val b2 = new Boy("lisi", 9999)
    val boy = mr.choose(b1, b2)
    println(boy.name)
  }

}
