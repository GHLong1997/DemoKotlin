package com.example.framgiahangoclong.basickotlin.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.framgiahangoclong.basickotlin.R
import com.example.framgiahangoclong.basickotlin.Singleton

class SingletonActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_singleton)

    Singleton.myFunction()

  }
}
