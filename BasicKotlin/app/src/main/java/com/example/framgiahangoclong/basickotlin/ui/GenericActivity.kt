package com.example.framgiahangoclong.basickotlin.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.framgiahangoclong.basickotlin.Generic
import com.example.framgiahangoclong.basickotlin.R
import com.example.framgiahangoclong.basickotlin.SourceIn
import com.example.framgiahangoclong.basickotlin.SourceOut
import kotlinx.android.synthetic.main.activity_main.*

class GenericActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_generic)

    //Anonymous inner class instances are created using an object expression:
//    nextActivity.setOnClickListener(object : View.OnClickListener {
//      override fun onClick(v: View?) {
//
//      }
//
//    })

    var generic = Generic<Int>(1)
    generic.getA(3)

    //type projection
    val ints: Array<Int> = arrayOf(1, 2, 3)
    val any = Array<Any>(3) { "" }
    copy(ints, any) //error nkếu o thêm out ở function define

    val l = singletonList(1)

  }

  fun demo(strs: SourceOut<String>) {
    var objectt: SourceOut<Any> = strs
  }

  fun demo1(strs: SourceIn<Number>) {
    strs.compareTo(1.0)// 1.0 has type Double, which is a subtype of Number
    // Thus, we can assign x to a variable of type Comparable<Double>
    val y: SourceIn<Double> = strs
  }


  //type projections
  fun copy(from: Array<out Any>, to: Array<Any>) {
    assert(from.size == to.size)
    for (i in from.indices) {
      to[i] = from[i]
    }
  }

  fun copy1(from: Array<in String>, value: String) { //Array<in String>tương ứng với Java Array<? super String>

  }

//  fun <T> singletonList(item: T): List<T> {
//    var list: List<T> = List<T>(2, {it -> it *2})
//    return list
//  }

  /**
   * generic func
   */
  fun <T> singletonList(item: T): List<T> {
    // ...
    return listOf()
  }




}
