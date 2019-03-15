package com.test.scala.actor

import scala.actors.Actor

/**
  * Created by Chester on 2017/8/15.
  */
class MyActor extends Actor{

  override def act(): Unit = {
    while (true) {
      //receive方法，当发送消息的时候，底层会创建一个线程，使用完成后，销毁该线程
      receive{
        case "start" => {
          println("starting...")
          Thread.sleep(2000)
          println("started")
        }
        case "stop" => {
          println("stopping...")
          Thread.sleep(2000)
          println("stopped")
        }
      }
    }
  }
}

//Actor发送消息，其内部执行是有顺序的，先进先出
object MyActor extends App {

  val actor = new MyActor
  actor.start()
  // ！ 发送异步消息，无返回值
  actor ! "start"
  actor ! "stop"
  println("消息发送完成")
}
