package com.example.framgiahangoclong.basickotlin.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.framgiahangoclong.basickotlin.DataUser
import com.example.framgiahangoclong.basickotlin.Inner
import com.example.framgiahangoclong.basickotlin.R
import com.example.framgiahangoclong.basickotlin.User
import com.example.framgiahangoclong.basickotlin.ui.companion.MyClass
import com.example.framgiahangoclong.basickotlin.ui.companion.foo
import com.example.framgiahangoclong.basickotlin.ui.MainActivity

class ExtensionActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_extension)
    val v = mutableListOf(1,2,3)
    v.swap(0,2)
    Log.d("haha", v.toString())

    val f = Inner()
    f.foo()


    //extension companion object
    MyClass.foo()


    //data class
    var dataUser = DataUser("Long", 18)
    dataUser.na = "sadasd"

    val olderJack = dataUser.copy(age = 2)


  }



//  private fun MutableList<Int>.swap(index1: Int, index2: Int) {
//    val tmp = this[index1]
//    this[index1] = this[index2]
//    this@swap[index2] = tmp
//  }

  private fun <T> MutableList<T>.swap(index1: Int, index2: Int) {
    val tmp = this[index1]
    this[index1] = this[index2]
    this@swap[index2] = tmp
  }

  fun Inner.foo() {
    Log.d("haha", "extension")
  }

  fun MainActivity.toasts(string: String) {
    Toast.makeText(this, string, Toast.LENGTH_SHORT).show()
  }

}
