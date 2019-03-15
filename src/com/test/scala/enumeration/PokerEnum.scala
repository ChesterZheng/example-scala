package com.test.scala.enumeration

/**
  * Created by Chester on 2016/12/20.
  */
object PokerEnum extends Enumeration{

  val heart = Value(0,"红桃")
  val diamond = Value("方片")
  val spade = Value
  val club = Value

  def main(args: Array[String]) {

    println(PokerEnum.club.id)
  }

}
