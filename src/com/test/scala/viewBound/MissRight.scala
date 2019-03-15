package com.test.scala.viewBound

import com.test.scala.generic.MyPreDef.girl2Ordered
/**
  * 视图界定示例(viewBound)
  * 【注意】：viewBound必须存在一个隐式转换的方法!!!
  */
class MissRight[T <% Ordered[T]] {

  def choose(first: T, second: T): T = {
    if (first > second) first else second
  }
}

object MissRight {

  def main(args: Array[String]) {

    val mr = new MissRight[Girl]

    val g1 = new Girl("ab", 90)
    val g2 = new Girl("mr", -1)

    val g = mr.choose(g1, g2)

    println(g.name)
  }

}
