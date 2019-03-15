package com.test.scala.actor

//注意导包是scala.actors.Actor
import scala.actors.Actor

/**
  * Created by Chester on 2017/8/15.
  */
object ActorDemo01 extends Actor{

  //act方法相当于java的线程中的run方法
  override def act(): Unit = {
    for (i <- 1 to 10){
      println("ActorDemo01 "+i)
      Thread.sleep(1000)
    }
  }
}

object ActorDemo02 extends Actor{

  //act方法相当于java的线程中的run方法
  override def act(): Unit = {
    for (i <- 1 to 10){
      println("ActorDemo02 "+i)
      Thread.sleep(1000)
    }
  }
}

object ActorTest extends App {

  ActorDemo01.start()
  ActorDemo02.start()
}
