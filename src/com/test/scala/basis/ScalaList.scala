package com.test.scala.basis

/**
  * Created by Chester on 2016/12/14.
  */
class ScalaList {

}

object ScalaList extends App {

  val list = List(1, 2, 3)
  println(list.toBuffer)

  //将0插入到lst1的前面生成一个新的List
  val list1 = 0::list
  println(list1.toBuffer)

  val list2 = List(4, 5, 6)
  println(list1 ++ list2)

  val list3 = List(1,2,3,4,5,6,7,8,9,10)

  println(list3.filter(_ % 2 ==0))


}