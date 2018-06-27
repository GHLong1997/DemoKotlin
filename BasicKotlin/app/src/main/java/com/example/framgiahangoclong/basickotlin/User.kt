package com.example.framgiahangoclong.basickotlin

import android.util.Log

/**
 * mặc định class là final nên ko thể kế thừa,
 * nếu muốn class lớp con kế thừa đc nó thì phải có từ khóa open
 * khối init chỉ chạy sau khi đối tượng đc khởi tạo
 * If the primary constructor does not have any annotations or visibility modifiers, the constructor keyword can be omitted
 * open class can be inherit abstract and else
 * lateinit: init after
 */
open class User( val nam: String, private var age: Int?): AbstractUser(), UserA {

  override fun getA() {

  }

  override fun abstractA() {

  }

  private var name: String = nam


  //initializer block
  init {
    this.name = "haha"
    Log.d("haha", "initializer ${this.name}")
  }

  open var size: Int = name.length.also { println("Initializing size in Base: $it")  }

  open fun talk() {
    Log.d("haha", "initializer ${this.nam}")

  }

  open fun sameMethod() {

  }

  //getter and setter
  var isAdult: Boolean
    get() {
      if (age == null) {
        return false
      } else if (age!! > 18) {
        return true
      }
      return false
    }

  //seter
    set(value) {
      age = if (value == true) 18 else null
    }


  //access modifier of set is private, not change default implementation
  var sex: Boolean = false
  private set

}

