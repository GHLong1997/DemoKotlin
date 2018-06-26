package com.example.framgiahangoclong.basickotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.log

class MainActivity : AppCompatActivity() {

  val a: Int = 1  // immediate assignment
  val b = 2   // `Int` type is inferred
  var c: Int = 0 // Type required when no initializer is provided
  // deferred assignment
  var d = 1
  var s1 = "a is $d"

  // arbitrary expression in template:
  val s2 = "${s1.replace("is", "was")}, but now is $a"

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
//    Log.d(MainActivity::class.simpleName, sum(1,2).toString() + "-" + sum1(1,2)  + "-" +s2 + "-" + maxOf(1,2)  + "sad-" +     getStringLength("aaaaa"))
//    printSum(1,2)
//
//
//
//    /**
//     * loop
//     */
//
//    val items = listOf("apple", "samsung", "k", "orange")
//    for (item in items) {
//      print(item)
//    }
//
//    //or
//
//    val items1 = listOf("apple", "banana", "kiwifruit")
//    for (index in items1.indices) {
//      println("item at $index is ${items1[index]}")
//    }
//
//    val items2 = listOf("apple", "banana", "kiwifruit")
//    var index = 0
//    while (index < items2.size) {
//      println("item at $index is ${items2[index]}")
//      index++
//    }
//
//
//    //will print juicy string if items array has orange string
//    when {
//      "orange" in items -> println("juicy") //if has will stop
//      "apple" in items -> println("apple is fine too")
//    }
//
//
//    /**
//     * ranges
//     */
//    val x = 10
//    val y = 9
//
//    //Check if a number is within a range using in operator:
//    if (x in 1..y+1) {
//      Log.d("hahaX", x.toString())
//    }
//
//    //duyệt hết 1 range
//    for (x in 1..y+1) {
//      Log.d("hahaXY", x.toString())
//    }
//
//    //Check if a number is out of range
//    val list = listOf("a", "b", "c")
//    if (-1 !in 0..list.lastIndex) {
//      println("-1 is out of range" + list.indices)
//    }
//
//    if (list.size !in list.indices) {
//      println("list size is out of valid list indices range too")
//    }
//
//
//    for (k in 1..10 step 2) {//1,3,5,7,9
//      Log.d("keke", "$k")
//    }
//    println()
//    for (k in 9 downTo 0 step 3) {
//      Log.d("kekeke", "$k") //9,6,3,0
//    }
//    Log.d("haha", describe("Hello"))


    /**
     *  Tổng hợp range
     */
//    for(i in 1..10) {
////      Log.d( "haha", "$i") //1 - > 10
//    }
//
//    for (i in 1 until 10) {
//      print(i) // 1 -> 9
//    }
//
//    for (i in 2..10 step 2) {
////      Log.d( "kaka", "$i") //2,4,6,8,10
//    }
//
//    for (i in 10 downTo 1) {
////      Log.d( "kaka", "$i") //10 -> 1
//    }
//
//    if (1 in 1..10) {
//      Log.d( "kaka", "1 is in range")
//    }
//

    /**
     * Read only list
     */

    val list = listOf("a", "b", "c")

    /**
     * Read only map
     */
    val map = mapOf("a" to 1, "b" to 2, "c" to 3)
    Log.d("haha", map["a"].toString())


    /**
     *let
     *Execute if not null
     */
    val value = null
    value?.let {
      Log.d("haha", "value not null")
    }

    /**
     *Get first item of a possibly empty collection
     */
    val value1 = listOf(1, 2, 3)
    val mainValue = value1.firstOrNull()
    Log.d("haha", mainValue.toString())

    var item = 0
    var item1 = 2
    var item2 = item1?.let { item1 = it } ?: 3
    Log.d("haha1", item2.toString())

    //transform
    Log.d("haha", transform("red").toString())


    /**
     * if
     */
    fun foo(param: Int) {
      val result = if (param == 1) {
        "one"
      } else if (param == 2) {
        "two"
      } else {
        "three"
      }
      foo(2)
      Log.d("haha", result)
    }


  }

  /**
   * transform
   */

  fun transform(color: String) : Int {
    return when(color) {
      "red" -> 0
      "green" -> 1
      "blue" -> 2
      else -> throw IllegalArgumentException("Invalid color p value")
    }
  }

  /**
   * When
   */
  fun describe(obj: Any): String =
      when (obj) {
        1 -> "One"
        "Hello" -> "Greeting"
        is Long -> "Long"
        !is String -> "Not a string"
        else -> "Unknown"
      }

  /**
   *
   */
  fun sum(a: Int, b: Int): Int {
    return a + b
  }

  fun sum1(a: Int, b: Int) = a + b

  fun printSum(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
  }

  fun maxOf(a: Int, b: Int) {
    Log.d("haha", "${a + b}")
  }

  fun maxOf1(a: Int, b: Int) = if (a > b) a else b

  //Return null if str does not hold an integer:
  fun parseInt(str: String): Int? {
    return str.toInt()
  }

  fun printProduct(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    // Using `x * y` yields error because they may hold nulls.
    if (x != null && y != null) {
      // x and y are automatically cast to non-nullable after null check
      println(x * y)
    } else {
      println("either '$arg1' or '$arg2' is not a number")
    }
  }

  fun getStringLength(obj: Any): Int? {
    if (obj is String) { // is <=> instance of
      // `obj` is automatically cast to `String` in this branch
      return obj.length
    }

    // `obj` is still of type `Any` outside of the type-checked branch
    return null
  }

}
