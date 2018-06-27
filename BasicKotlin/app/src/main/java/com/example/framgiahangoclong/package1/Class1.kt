package com.example.framgiahangoclong.package1

import android.util.Log
import com.example.framgiahangoclong.package2.Class2


class Class1 {

  init {
    Log.d("class", "CLass1")
  }

  fun function1() {
    Log.d("class", "function1")
    var class2 = Class2()
    class2.function2()
  }

}