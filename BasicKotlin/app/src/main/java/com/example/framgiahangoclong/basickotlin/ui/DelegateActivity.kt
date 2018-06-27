package com.example.framgiahangoclong.basickotlin.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.framgiahangoclong.basickotlin.R
import com.example.framgiahangoclong.basickotlin.ui.delegate.ClassA
import com.example.framgiahangoclong.basickotlin.ui.delegate.ClassB
import com.example.framgiahangoclong.basickotlin.ui.delegate.User

/**
 * delegate: 1 object uy quyen cho 1 object khac thuc thi thay cong viec
 */
class DelegateActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delegate)

        val classA  = ClassA("Class A")
        val classB = ClassB(classA)
        classB.delegate()

        var user = User()
        println(user.todayTasks) //thằng này uy quyền cho thằng kia thực hiện getter,setter cho thuoc tinh today task
        user.todayTasks = "Kakakakak"

    }
}
