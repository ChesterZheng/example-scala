package com.test.scala.basis

/**
  * Scala定义构造器
  * 1.在类名后面的是主构造器
  * 2.可定义辅助构造器
  */
class ScalaConstructor(val id: Int, var name: String, private val age: Int, gender: String) {

  println("id=" + id)
  println("name=" + name)
  println("age=" + age)
  println("gender=" + gender)

  private var address: String = null

  /**
    * 定义辅助构造器
    *
    */
  def this(id: Int, name: String, age: Int, gender: String, address: String) {
    this(id: Int, name: String, age: Int, gender: String)
    this.address = address
  }

}

/**
  * 伴生对象
  */
object ScalaConstructor extends App {

  val sc = new ScalaConstructor(1, "tom", 20, "female", "Beijing")

  println(sc.address)

}
