package com.test.scala.curryfication

import com.test.scala.generic.MyPreDef._
import com.test.scala.viewBound.Girl

/**
  * 柯里化示例
  */
class MissR[T] {
  /**
    * 如果利用柯里化传入一个隐式转换函数
    * 其作用和视图界定(viewBound)是一样的
    * 都需要一个隐式转换的方法或者函数
    *
    * @param first
    * @param second
    * @param order
    * @return
    */
  def choose(first: T, second: T)(implicit order: T => Ordered[T]): T = {
    if (first > second) first else second
  }

  /**
    * 如果利用柯里化传入一个隐式的类型
    * 其作用和上下文界定(contextBound)是一样的
    * 都需要一个隐式转换的值
    * @param first
    * @param second
    * @param order
    * @return
    */
  def select(first: T, second: T)(implicit order: Ordering[T]): T = {
    if (order.gt(first, second)) first else second
  }

  /**
    * select方法和select_2方法效果是一样的
    * @param first
    * @param second
    * @param order
    * @return
    */
  def select_2(first: T, second: T)(implicit order: Ordering[T]): T = {
    import Ordered.orderingToOrdered
    if (first > second) first else second
  }

}

object MissR {

  def main(args: Array[String]) {

    val mr = new MissR[Girl]
    val g1 = new Girl("aaa", 80)
    val g2 = new Girl("bbb", 90)
    val g = mr.choose(g1, g2)
//    val g = mr.select_2(g1,g2)
    println(g.name)

  }

}
