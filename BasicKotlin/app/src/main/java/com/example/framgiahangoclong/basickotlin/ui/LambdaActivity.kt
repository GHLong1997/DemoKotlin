package com.example.framgiahangoclong.basickotlin.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.framgiahangoclong.basickotlin.R
import kotlinx.android.synthetic.main.activity_lambda.*
import kotlin.math.max

/**
 * lambda, Higher-Order function là function có thể nhận một function như một param hoặc có thể trả về một function
 */

class LambdaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lambda)

        val items = listOf(1, 2, 3)

        items.fold(0, { acc: Int, i: Int ->
            print("acc = $acc, i = $i")
            val result = acc + i
            println("result = $result")
            result
        })

        val joinedToString = items.fold("Elements:", { acc, i -> acc + " " + i })

        var product = items.fold(1, Int::times)


        button.setOnClickListener({ view -> Toast.makeText(this@LambdaActivity, "haha", Toast.LENGTH_SHORT).show() })

        button.setOnClickListener() { view -> Toast.makeText(this@LambdaActivity, "haha", Toast.LENGTH_SHORT).show() }

        button.setOnClickListener { view -> Toast.makeText(this@LambdaActivity, "haha", Toast.LENGTH_SHORT).show() }

        button.setOnClickListener { Toast.makeText(this@LambdaActivity, "haha", Toast.LENGTH_SHORT).show() }

        println("Sum =  ${sum2(1, 2)}")

        println("Sum =  ${sum6(1.2, 2.2)}")

        val sum: (Int, Int) -> Int = { x, y -> x + y }


        apply(1, 2, sum)

        //su dung tham chieu function
        apply(1, 2, ::sum1)

        val sumLambda: (Int, Int) -> Int = ::sum1

        //
        doSomething(1000, ::processWithResult)

        // Toán tử :: có thể sử dụng với các overload function
        val numbers = listOf(1, 2, 3)
        println(numbers.filter(::isOdd)) // refers to isOdd(x: Int)

        //

        doSomething(1000, { result ->
            // do something with result
        })


        doSomething(1000, { result: String? ->
            // do something with result
        })

        doSomething(1000) {
            println("The result is $it")
            // do something with result
        }

        //hight order no param
        doATask(bodyFunction)


    }

    fun apply(x: Int, y: Int, op: (Int, Int) -> Int): Int = op(x, y)

    fun sum1(x: Int, y: Int) = x + y

    //cachs 1
    val sum2 = { x: Int, y: Int -> x + y }

    //cach2 lambda
    val sum3: (Int, Int) -> Int = { x, y -> x + y }

    val compare: (Int, Int) -> Boolean = { x, y -> x < y }

    fun express(a: Int, b: Int): Int {
        return a + b
    }

    fun compare(a: String, b: String): Boolean = a.length < b.length

    val summ: (Int) -> Int = {x -> x}

    //test lambda 3 param
    val sum4: (Int, Int, Int) -> Int = { x, y, z -> x + y + z }

    val sum5 = { x: Int, y: Int, z: Int -> x + y + z }


    //anonymous function
    var sum6 = fun(x: Double, y: Double): Double = x + y


//  data?.let { applyUiChanges(data) }
//
//  private fun updateUI(data: Data?) {
//    if(data != null){
//      applyUiChanges(data)
//    }
//  }
//
//  private fun applyUiChanges(data: Data) {
//    // Do cool stuff in UI
//  }


    //high-order-function have 1 param
    fun doSomething(number: Int, receiver: (String?) -> Unit) {
        var result: String? = null
        receiver(result)
    }

    fun processWithResult(result: String?): Unit {
        // do something with result
    }


    fun isOdd(x: Int) = x % 2 != 0





    //high order have no param
    fun doATask(body: () -> Int): Int {
        return body()
    }

    var bodyFunction = fun(): Int {//anonymous func
        return 1
    }

}
