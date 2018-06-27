package com.example.framgiahangoclong.basickotlin.ui.companion

/**
 * can also define extension function for companion object
 */
class MyClass {
  companion object {
    fun create(): MyClass = MyClass()
  }
}

fun MyClass.Companion.foo() {

}