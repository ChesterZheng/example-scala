package com.test.scala.makeClass

/**
  * 创建Scala类
  *
  * Created by Chester on 2017/8/8.
  */
class Person {

  //val修饰的变量，相当于java中final修饰的变量，且只有get方法，没有set方法
  val id = "9527"
  //var修饰的变量
  var age: Int = 18
  //private修饰的变量只能在该类的伴生对象中访问
  private var name: String = "Tommy"
  //private[this]修饰的变量只能在该类内部被访问，相当于java中的private的变量
  private[this] var pet = "DOG"


}

//伴生对象：与类名相同并且与该类在统一个文件中
object Person{

  //在伴生对象中定义的变量，相当于java中的static变量
  val i = 1

  //在伴生对象中定义的方法，相当于java中的static方法
  def m1(): Unit ={

  }

  def main(args: Array[String]) {
    val p = new Person()
    println(p.id)
    println(p.age)
    p.age = 200
    println(p.age)
    println(p.name)
    p.name = "abc"
    println(p.name)
  }

}
