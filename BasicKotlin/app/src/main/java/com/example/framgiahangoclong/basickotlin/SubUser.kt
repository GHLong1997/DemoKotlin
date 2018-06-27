package com.example.framgiahangoclong.basickotlin

class SubUser(var kaka: String, nam: String, age: Int) :User(nam, age), UserB1 {


  override fun talk() {
    super.talk()
  }


  override fun sameMethod() {
    super<UserB1>.sameMethod()
    super<User>.sameMethod()
  }
  fun f() {

  }


  /**
   * To access Outer class -> use super keyword and declare inner keyword
   */
  inner class InnerSubUser {
    fun g() {
      super@SubUser.talk() //initializer haha
    }
  }
}
