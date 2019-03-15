package com.test.scala.actor

import scala.actors.Actor

/**
  * Created by Chester on 2017/8/16.
  */
class MyActor02 extends Actor{

  override def act(): Unit = {
    loop{
      react{
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

object MyActor02 extends App {

  val actor = new MyActor02
  actor.start()
  actor ! "start"
  actor ! "stop"
  println("发送消息完成")

}
