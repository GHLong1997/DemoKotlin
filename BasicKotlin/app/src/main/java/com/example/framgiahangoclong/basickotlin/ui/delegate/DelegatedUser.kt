package com.example.framgiahangoclong.basickotlin.ui.delegate

import kotlin.reflect.KProperty

/**
 *  Sử dụng Delegated property trong trường hợp một class này muốn
 *  trao quyền thực thi các hàm getter hay setter của một thuộc tính này cho một lớp khác thực thi.
 *  KProperty: la thuoocj tinh todayTask
 */
class DelegatedUser {

    operator fun getValue(user: User, property: KProperty<*>): String {
       return "$user, thank for delegating ${property.name} to me"
    }
                                                              // new value
    operator fun setValue(user: User, property: KProperty<*>, value: String) {
        println("assign to '${property.name} in $user Detail $value'")
    }
}