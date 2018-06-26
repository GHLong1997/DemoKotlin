package com.example.framgiahangoclong.kotlin

/**
 * có 2 cách khai báo constructor
 * Khai báo bên phải tên class
 * Khai báo trong class
 */
              //cách 1
class Student(nam: Int) {  // (): primary constructor ,(param) constructor have param

  var hoten: String = ""

  private var namsinh: Int = 0

  init {
    namsinh = nam
  }

  //cách 2
//  constructor()

//  constructor(nam : Int) {
//    namsinh = nam
//  }

  fun setNamsinh(nam: Int) {
    namsinh = nam
  }

  fun getNamSinh(): Int {
    return namsinh
  }

}