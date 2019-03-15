package com.test.scala.generic

import java.io.File

import com.test.scala.viewBound.Girl
import com.test.scala.implicits.RichFile

/**
  * 隐式转换的“门面”
  * 【注意】：若不同包下有相同的实体类
  *  而他们需要共用同一个隐式转换的方法
  *  需要指定对应包！！！
  *  否则会找不到
  *  No implicit Ordering defined for xxx.xxx.xxx.Class
  */
object MyPreDef {

  //隐式转换方法(将原有的类型转换为增强的类型)
  implicit def file2RichFile(file: File): RichFile = new RichFile(file)

  /**
    * 使用视图界定(viewBound)的时候
    * 需要在“门面”里定义一个“隐式转换方法”
    *
    * @return
    */
//  implicit def girl2Ordered(girl: Girl): Ordered[Girl] with Object {def compare(that: Girl): Int} = new Ordered[Girl] {
//    override def compare(that: Girl): Int = {
//      girl.faceValue - that.faceValue
//    }
//  }
  /**
    * 如果利用柯里化传入一个隐式转换函数
    * 其作用和视图界定(viewBound)是一样的
    * 都需要一个隐式转换的方法或者函数
    */
  implicit val girl2Ordered = (girl: Girl) => new Ordered[Girl] {
    override def compare(that: Girl): Int = {
      girl.faceValue - that.faceValue
    }
  }

  /**
    * 当使用上下文界定(contextBound)的时候
    * 需要在“门面”里添加一个值
    * 即使用implicit object T
    */
  implicit object Girl2Ordering extends Ordering[Girl] {
    override def compare(x: Girl, y: Girl): Int = {
      x.faceValue - y.faceValue
    }
  }

}
