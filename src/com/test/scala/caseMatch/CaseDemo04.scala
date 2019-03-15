package com.test.scala.caseMatch

import scala.util.Random

/**
  * Case Class（可以匹配的类）
  *
  * Case Object（可以匹配的单例对象）
  *
  * Created by Chester on 2017/8/15.
  */
object CaseDemo04 extends App {

  val arr = Array(CheckTimeOutTask, HeartBeat(88888), new HeartBeat(66666),
    SubmitTask("0001", "zhangsan"))

  val a = arr(Random.nextInt(arr.length))

  println(a)

  a match {
    case SubmitTask(id, name) => {
      println(s"$id, $name")
    }
    case HeartBeat(time) => {
      println(time)
    }
    case CheckTimeOutTask => {
      println("CheckTimeOutTask")
    }

  }
}

//单例（全局唯一）
case object CheckTimeOutTask

//即可封装数据，又可做模式匹配（【注意】：case class 不用使用new）
case class HeartBeat(time: Long)

case class SubmitTask(id: String, name: String)