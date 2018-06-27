package com.example.framgiahangoclong.basickotlin.ui

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.framgiahangoclong.basickotlin.DataUser
import com.example.framgiahangoclong.basickotlin.Inner
import com.example.framgiahangoclong.basickotlin.R
import com.example.framgiahangoclong.basickotlin.User
import com.example.framgiahangoclong.package1.Class1
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val a: Int = 1  // immediate assignment
    val b = 2   // `Int` type is inferred
    var c: Int = 0 // Type required when no initializer is provided
    // deferred assignment
    var d = 1
    var s1 = "a is $d"

    // arbitrary expression in template:
    val s2 = "${s1.replace("is", "was")}, but now is $a"

    /**
     * lateinit: khoi tao sau
     */
    lateinit var init: String
    lateinit var user1: User

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setName(null)

        nextActivity.setOnClickListener {
            intent = Intent(this@MainActivity, ExtensionActivity::class.java)
            startActivity(intent)
        }

        genericActivity.setOnClickListener {
            startActivity(Intent(this@MainActivity, GenericActivity::class.java))
        }

        lambdaActivity.setOnClickListener {
            startActivity(Intent(this@MainActivity, LambdaActivity::class.java))
        }

        delegateActivity.setOnClickListener {
            startActivity(Intent(this@MainActivity, DelegateActivity::class.java))
        }

        var user = User("long", 22)
        user.talk()
        Log.d("haha", "${user.isAdult}")
        user.isAdult = false
        Log.d("haha", "${user.isAdult}")

        //lateinit
        init = "aaaa"


        var class1 = Class1()
        class1.function1()

        /**
         * hashcode
         */
        var user1 = DataUser("Long", 17)
        var backupUser = user1.copy() //chỉ cop dc data class

//    if (user1.hashCode() == backupUser.hashCode()) {
//      Toast.makeText(this@MainActivity, "Same content", Toast.LENGTH_SHORT).show()
//    }
/*
    if (user1.equals(backupUser)) {
      //same above
    }*/

        /**
         * Nested, Inner
         */
        Inner.Nested().ok() // hế này alf đủ


        var inner = Inner()
        inner.Inne().okk()


        /**
         * anonymous function
         */
        var a = fun(name: String) {
            print(name)
        }
        a("haha")

        /**
         * Null safety
         */

        var len: List<Int?> = listOf(1, 2, null, 4)
        var intlist: List<Int> = len.filterNotNull()
        print(intlist)

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
//    val value1 = listOf(1, 2, 3)
//    val mainValue = value1.firstOrNull()
//    Log.d("haha", mainValue.toString())
//
//    var item = 0
//    var item1 = 2
//    var item2 = item1?.let { item1 = it } ?: 3
//    Log.d("haha1", item2.toString())
//
//    //transform
//    Log.d("haha", transform("red").toString())


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

        /**
         *Array
         */
        val innumber: Array<Int> = arrayOf(1, 2, 3, 4, 5)
        for (i in innumber) {
            print("innumber $i")
        }

        var array: Array<Int> = Array(3, { it -> it * 2 })//0,2,4,6

        /**
         * Toán tử elvist ?:
         */

        //normal
        var b: String? = "Hello"
//    val l: Int = if (b != null) b.length else -1
        //elvist
        var l = b?.length ?: -1

        /**
         * Toán tử !!
         */
        //nếu b ko null, l = b.length, ngược lại NPE throw
        val m = b!!.length


        /**
         * toán tử so sánh === và ==
         * a===b <=> a và b cùng trỏ đến 1 object
         * a==b, compiler sẽ tranlate thành  a?equals(b) ?: (b===null), a ko null sẽ gọi function  equal để kiểm tra với b, nếu a null
         * sẽ kiểm tra b có trỏ tới null hay koo     */


        /**
         * check kiểu
         */

        //java
//    if (s instanceOf String){
//
//    }

        //kotlin
//    if (s is String){
//
//    }

        /**
         * cast , sử dụng as
         */
//    val s4: String? = s5 as? String

//    var r: Int = if (result) { // nếu là khối lệnh, giá trị ở khối lệnh là giá trị trả về
//      print("ok")
//      1
//    } else {
//      print("fail")
//      0
//    }


        /**
         * mutable list and immutable
         */
        val fruit = mutableListOf("Banana", "Kiwifruit", "Mango", "Apple") // if is listOf -> error, default it cannot change
        fruit[1] = "Orange"
        fruit.removeAt(2)
        fruit.add("Pear")

        /**
         * set, cannot get element by position, every elemnt has to be unique
         */
        // Create a mutable set (MutableSet).
        val animals = mutableSetOf("Lion", "Dog", "Cat", "Python", "Hippo")

// Add an element to the set.
        animals.add("Dog")

// Remove a existing element from a set.
        animals.remove("Python")
        Log.d("set", "set $animals")

        /**
         * Map: A group of key/value pairs where every key has to be unique
         */
        // Create a mutable map (MutableMap)
        val nzPop = mutableMapOf("AUCK" to 1500000, "WLG" to 405000, "CHCH" to 500000, "GIS" to 36100)

// Change a existing entry in the map.
        nzPop["CHCH"] = 389700


// Remove a entry from the map by key.
        nzPop.remove("GIS")


    }

    /**
     * transform
     */

//  fun transform(color: String) : Int {
//    return when(color) {
//      "red" -> 0
//      "green" -> 1
//      "blue" -> 2
//      else -> throw IllegalArgumentException("Invalid color p value")
//    }
//  }

    /**
     * When
     */
//  fun describe(obj: Any): String =
//      when (obj) {
//        1 -> "One"
//        "Hello" -> "Greeting"
//        is Long -> "Long"
//        !is String -> "Not a string"
//        else -> "Unknown"
//      }
//
//
//
//  fun checkNumber(input : Int) = when (input) {
//    0 -> {
//      print("do something")
//      print("This is Zero")
//    }
//    1,2 -> print("")
//    else -> print("many")
//  }

    /**
     *funnction
     */
//  fun sum(a: Int, b: Int): Int {
//    return a + b
//  }
//
//
//  fun sum1(a: Int, b: Int): Int = a + b // nếu có 1 dòng trong hàm thì bỏ dấu ngoặc l
//
//
//  fun printSum(a: Int, b: Int) {
//    println("sum of $a and $b is ${a + b}")
//  }
//
//  fun maxOf(a: Int, b: Int) {
//    Log.d("haha", "${a + b}")
//  }
//
//  fun maxOf1(a: Int, b: Int) = if (a > b) a else b

    //Return null if str does not hold an integer:
//  fun parseInt(str: String): Int? {
//    return str.toInt()
//  }
//
//  fun printProduct(arg1: String, arg2: String) {
//    val x = parseInt(arg1)
//    val y = parseInt(arg2)
//
//    // Using `x * y` yields error because they may hold nulls.
//    if (x != null && y != null) {
//      // x and y are automatically cast to non-nullable after null check
//      println(x * y)
//    } else {
//      println("either '$arg1' or '$arg2' is not a number")
//    }
//  }
//
//  fun getStringLength(obj: Any): Int? {
//    if (obj is String) { // is <=> instance of
//      // `obj` is automatically cast to `String` in this branch
//      return obj.length
//    }
//
//    // `obj` is still of type `Any` outside of the type-checked branch
//    return null
//  }
//
//
//  fun areaOfRectangle(width : Double, height: Double = width) : Double {// nếu giá trị truyền vào height null
//                                          // thì nó sẽ lấy giá trị mặc định của width
//   return 1.2
//  }
//
//  //void
//  fun greet(per : String) {
//    //ko return, xử lý jcũng đc,  Unit same as void
//  }


    /**
     * vararg: sử dụng khi ko biết đầu vào có bao nhiêu param
     */
    //multi(10)
    //multi(1,2,3,4,5)
//  fun multi(vararg intPa : Int) {
//    for (i in intPa) {
//      print(  i)
//    }
//  }

    /**
     *tailrect: tự đông break để app ko bị treo
     */


    /**
     * object
     */

//    open class A(x: Int) {
//        public open val y: Int = x
//    }
//
//    interface B {...}
//
//    val ab: A = object : A(1), B {
//        override val y = 15
//    }


    /**
     * varags
     */

//    A parameter of a function (normally the last one) may be marked with vararg modifier:
//
//    fun <T> asList(vararg ts: T): List<T> {
//        val result = ArrayList<T>()
//        for (t in ts) // ts is an Array
//            result.add(t)
//        return result
//    }
//    allowing a variable number of arguments to be passed to the function:
//
//    val list = asList(1, 2, 3)

    fun setName(name: String?) {
        var username = name ?: "NA"
    }

}
