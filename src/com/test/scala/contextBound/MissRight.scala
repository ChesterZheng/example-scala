package com.test.scala.contextBound

import com.test.scala.generic.MyPreDef.Girl2Ordering
import com.test.scala.viewBound.Girl
/**
  * 上下文界定示例(contextBound)
  */
class MissRight[T: Ordering] {
  def select(first: T, second: T): T = {
    /**
      * 若想使用上下文界定[T : Class]
      * 1.必须手动的将T类型转换成你想使用的类型
      * 即使用implicitly[Ordering[T]]
      */
    val order = implicitly[Ordering[T]]
    if (order.gt(first, second)) first else second
  }
}

object MissRight {

  def main(args: Array[String]) {
    val mr = new MissRight[Girl]
    val g1 = new Girl("zhangsan", 99)
    val g2 = new Girl("lisi ", 90)
    val g = mr.select(g1, g2)
    println(g.name)
  }

}
