package com.test.scala.makeClass

/**
  * 每个类都有主构造器
  * 主构造器的参数直接放在类名后面
  * 与类名交织在一起
  * 在构造器中定义的变量 faceValue: Double = 99.99 既没有val也没有var
  * 那就相当于private[this] faceValue: Double = 99.99
  *
  * Created by Chester on 2017/8/9.
  */
class Student (val name: String, var age: Int, private var height: Int = 18,
               faceValue: Double = 99.99) {

  private[this] var gender: String = null

  //辅助构造器定义必须使用 def this
  //并且辅助构造器的第一行【必须】调用主构造器
  def this(name: String, age: Int, gender: String ){

    this(name, age)

    this.gender = gender
  }

  try{
    println("===Yes===")
  }catch{
    case e: NullPointerException => println("hahaha")
  }

}

object Student {

  def main(args: Array[String]) {

    val s = new Student("zxc",30,100,180)
    println(s.age)
    println(s.name)
    s.age = 22
    println(s.height)
    s.height = 199
    println(s.age)
    println(s.height)
  }
}
