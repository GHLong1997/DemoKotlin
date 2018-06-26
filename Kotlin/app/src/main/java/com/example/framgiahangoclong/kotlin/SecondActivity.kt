package com.example.framgiahangoclong.kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class SecondActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_second)
    val intent = intent
    val haha: String = intent.getStringExtra("haha")
    val hihi : IntArray  = intent.getIntArrayExtra("hihi")
    val phuongtien : PhuongTien = intent.getParcelableExtra("kaka")
    Toast.makeText(this, haha + "-" + hihi[0] + "- " + phuongtien.name, Toast.LENGTH_SHORT).show()
  }
}
