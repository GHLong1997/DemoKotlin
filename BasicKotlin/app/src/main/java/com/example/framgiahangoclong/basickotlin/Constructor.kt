package com.example.framgiahangoclong.basickotlin

/**
 * only declare primary constructor if it have visibility modifiers and annotation
 */
class Constructor public constructor(name: String) {


}

class SecondaryConstructor {
  constructor(name: String) {
  }
}

class PrimaryConstructor private constructor() {

}