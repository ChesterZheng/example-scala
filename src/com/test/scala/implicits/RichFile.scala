package com.test.scala.implicits

import java.io.File

import com.test.scala.generic.MyPreDef._

import scala.io.Source//隐式转换的“门面”


/**
  * 隐式转换
  */
class RichFile(file: File) {

  def read(): String = Source.fromFile(file).mkString

}

/**
  * 【注意】：自定义隐式转换使用时必须显示的导入（import）自定义的“门面”
  */
object RichFile {

  def main(args: Array[String]) {


    val file = new File("E://BigData-test//scala-test//a.txt")

    //使用装饰模式（设计模式），显示的增强
    //val rf = new RichFile(file)
    //val content = rf.read()

    //隐式转换：隐式的进行方法增强
    val content = file.read()

    println(content)


  }

}