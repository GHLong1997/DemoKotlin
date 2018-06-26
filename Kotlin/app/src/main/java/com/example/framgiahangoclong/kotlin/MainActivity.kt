package com.example.framgiahangoclong.kotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {

    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    textView.text = "aaaa"
    Toast.makeText(this, textView.text, Toast.LENGTH_SHORT).show()

    button.setOnClickListener {
      var editString: String = edittext.text.toString()
      var editInt : Int = (edittext.text.toString()).toInt()
      textView.text = editString + "-" + editInt.toString()
    }

    button.setOnClickListener(object : View.OnClickListener {
      override fun onClick(v: View?) {
        Toast.makeText(this@MainActivity, textView.text, Toast.LENGTH_SHORT).show()
      }
    })


//    val intent : Intent = Intent(this@MainActivity, SecondActivity::class.java) // applicationContext
//    val arrayNumber :IntArray = intArrayOf(1,2,3,4)
//    val phuongtien : PhuongTien = PhuongTien("akak")
//    intent.putExtra("haha", "haha")
//    intent.putExtra("hihi", arrayNumber)
//    intent.putExtra("hoho", phuongtien)
//    intent.putExtra("kaka", PhuongTien("akkaka"))
//    startActivity(intent)



    /**
     * variable
     */
//    var a: String? = ""  // ? allow null
//    a = null
//    var b: String = null!!   //!! not
//    b = "sad" // error runtime

//    var c: Int = 10
//    var d: Int = 15
//    if (c > d) {
//      Toast.makeText(this, "lon nhat" + c, Toast.LENGTH_SHORT).show()
//    }else {
//      Toast.makeText(this, "lon nhat" + d, Toast.LENGTH_SHORT).show()
//    }

    /**
     * same as switch case, but can catch many condition, switch case just one (view example 2), nomarly only when catch to one dk then it's stop (here is when)
     */
//    var e: String = "LLong"
//    var f: Int = 3
//    when (e) {
//      "Long" -> Toast.makeText(this, "Long", Toast.LENGTH_SHORT).show()
//      "LLong" -> Toast.makeText(this, "LLong", Toast.LENGTH_SHORT).show()
//      "LLLong" -> Toast.makeText(this, "LLLong", Toast.LENGTH_SHORT).show()
//    }

//    when (e) {
//      "L", "Long" -> Toast.makeText(this, "Long", Toast.LENGTH_SHORT).show()
//      "LL","Long" -> Toast.makeText(this, "LLong", Toast.LENGTH_SHORT).show()
//      "LLL", "LLLong" -> Toast.makeText(this, "LLLong", Toast.LENGTH_SHORT).show()
//    }

//    when (f) {
//      in 1..3-> Toast.makeText(this, "Long", Toast.LENGTH_SHORT).show()  //1,2,3
//      in 2..4 -> Toast.makeText(this, "LLong", Toast.LENGTH_SHORT).show()
//      in 3..6 -> Toast.makeText(this, "LLLong", Toast.LENGTH_SHORT).show()
//      else -> Toast.makeText(this, "aaaaa", Toast.LENGTH_SHORT).show()
//    }

    /**
     * loop For
     */
//    for (i in 1..10) {//1->10
//      Log.d("haha", "loop: $i")
//    }
//
//    var a: Int = 5
//    for (i in 1 until a) { // 1 -> 4
//      Log.d("haha", "loop from down to up: $i")
//    }
//
//    for (i in a downTo 0) { //5 -> 0
//      Log.d("haha", "loop from up to down: $i")
//    }
//
//    for (i in 0..a step 2) { // lần đầu 0, lần sau + 2
//      Log.d("haha", "số lần thực hiện: $i")
//    }

    /**
     * Array
     */

//    //cách 1
//    var arrayA: IntArray = intArrayOf(1,2,3,4,5,6,7)
//    Log.d("haha", "arrayA: " + arrayA.get(1))
//
//    //cách 2
//    var arrayB: List<String> = listOf("Long", "Long1")
//    Log.d("haha", "arrayB: " + arrayB.get(1))
//
//    //cách 3
//    var arrayC: ArrayList<Int> = ArrayList()
//    arrayC.add(1)
//    arrayC.add(2)
//    arrayC.add(3)
//    arrayC.add(4)
//
////    arrayC.remove(3) //value remain: 1,2,4
//    arrayC.removeAt(1) //value remain :1,3,4

    /**
     *  function
     */

//    showName("Long")

    /**
     * Class
     */

//    var student: Student = Student(1000)
//    Log.d("haha", student.getNamSinh().toString() + "${student.getNamSinh()}") // nếu có biến bên trong đối tượng thì thêm ${}, con ko thì $ là đủ
//
//    val ptien: PhuongTien = PhuongTien("sadsa")
//    Log.d("haha", "aaaa" + ptien.name)



  }

//  fun showName(ten : String) {
//    Log.d("haha", ten)
//  }

}
