package com.example.framgiahangoclong.basickotlin


/**
 * purpose to hold data
 * cannot be inherited
 * provide some function as copy ..
 * When we specify the data keyword in our class definition, Kotlin automatically generates field accessors,
 * hashCode(), equals(), toString(), as well as the useful copy()
 * and componentN() functions (more on these later).

 *Any of the functions above which are manually defined by us in the class will not be generated.
 */
data class DataUser(var  name: String,var age: Int) {

  //property na cannot use inside hashCode(), equals(), toString() ...

  var na: String = ""

}