package com.example.framgiahangoclong.basickotlin

import android.util.Log

/**
 * inner class: allow access member of outer class, nested: not
 */
class Inner {

  private var apple: String = "Apple"
  private var banana: String = "Banana"

  fun foo () {
    Log.d("haha", "member")
  }

  class Nested {
    fun ok() {
      Log.d("haha", "Nested")
    }
  }

  inner class Inne {
    fun okk() {
      Log.d("haha", "Inner $apple")
    }
  }

}