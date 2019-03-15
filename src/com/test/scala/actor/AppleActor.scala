package com.test.scala.actor

import scala.actors.Actor

/**
  * Created by Chester on 2017/8/16.
  */

case class SyncMsg(id: Int, msg: String)

case class AsyncMsg(id: Int, msg: String)

case class ReplyMsg(id: Int, msg: String)

class AppleActor extends Actor {
  override def act(): Unit = {
    loop {
      react {
        case "start" => {
          println("starting...")
          Thread.sleep(2000)
          println("started")
        }
        case SyncMsg(id, msg) => {
          println(id + ",sync" + msg)
          Thread.sleep(2000)
          sender ! ReplyMsg(3, "finished")
        }
        case AsyncMsg(id, msg) => {
          println(id + ",async" + msg)
          Thread.sleep(2000)
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

object AppleActor extends App {

  val apple = new AppleActor
  apple.start()
//  apple ! AsyncMsg(1, "hello actor")
//  println("异步消息发送完成")

  //10000代表消息超时时间
//  val content = apple !?(10000, SyncMsg(2, "hello actor"))
//  println("同步消息发送完成")
//  println(content)
//  content match {
//    case Some(x) => println(x)
//    case _ => -1
//  }

  val reply = apple !! SyncMsg(2, "hello actor")
  println(reply.isSet)
  val c = reply.apply()
  println(reply.isSet)
  println(c)
}
