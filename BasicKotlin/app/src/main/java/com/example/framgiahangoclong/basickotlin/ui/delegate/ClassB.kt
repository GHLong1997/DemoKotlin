package com.example.framgiahangoclong.basickotlin.ui.delegate

class ClassB(b: InterfaceC) : InterfaceC by b {

    override fun delegate() {
        println(" This is class B")
    }
}
