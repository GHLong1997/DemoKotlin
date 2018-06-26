package com.example.framgiahangoclong.kotlin

import android.os.Parcel
import android.os.Parcelable

/**
 * class Phuongtien phải có ít nhất 1 primary constructor có tham số
 */
data class PhuongTien(val name : String) : Parcelable {
  constructor(parcel: Parcel) : this(parcel.readString())


  override fun writeToParcel(parcel: Parcel, flags: Int) {
    parcel.writeString(name)
  }

  override fun describeContents(): Int {
    return 0
  }

  companion object CREATOR : Parcelable.Creator<PhuongTien> {
    override fun createFromParcel(parcel: Parcel): PhuongTien {
      return PhuongTien(parcel)
    }

    override fun newArray(size: Int): Array<PhuongTien?> {
      return arrayOfNulls(size)
    }
  }

}