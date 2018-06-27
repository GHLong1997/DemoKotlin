package com.example.framgiahangoclong.basickotlin.ui.delegate

class ClassA(val de: String) : InterfaceC {

    override fun delegate() {
      println(" This is $de")
    }
}