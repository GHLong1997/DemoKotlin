package com.example.framgiahangoclong.basickotlin

/**
 * mặc định class là final nên ko thể kế thừa,
 * nếu muốn class lớp con kế thừa đc nó thì phải có từ khóa open
 * khối init chỉ chạy sau khi đối tượng đc khởi tạo
 */
open class User(open val nam: String?) {
    private var name: String? = ""

    init {
        name = nam
    }
}
class subUser(var kaka: String, nam: String?) :User(nam) {
    override val nam = "akakak"
}
