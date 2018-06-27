package com.example.framgiahangoclong.basickotlin

/**
 * "in" it can only be consumed and never produced
 */
interface SourceIn<in T> {

  fun compareTo(other: T): Int

}