package fpoly.namth.kotlinex1

fun main(){
    println("Lab 1 - MD18305")

    // khai báo biến: cách 1 - dùng val
    val a = 1
    val b = 2
    val c = a + b

    println("Tổng 2 số $a và $b là $c")

    // khai báo biến - ro kieu dữ lieu
    val s1 : Int = 3
    var s2 : Float = 4f

    var mess : String = "Tich 3 so $s1 va $s2 la: ${s1*s2}"
    println(mess)

    val soA = 5f
    val soB = 6f
    println("Thuong 2 so $soA va $soB la: ${phepChia(soA, soB)}")
}

fun phepChia(a:Float, b:Float ): Float {
    if ( b == 0f){
        return 0f
    }
    val c = a / b

    return c
}

fun bai1() {

    print("Trịnh Hoài Nam - PH31259\n")
    print("=========================\n")
    println("Quanh năm buôn bán ở mom sông")
    println("Nuôi đủ năm con với một chồng")
    println("\tlặn lội thân cờ khi quãng vắng")
    println("\teo sèo mặt nước buổi đò đồng")
    println("Một duyên hai nợ âu đành phận")
    println("Năm nắng mười mưa há chẳng công")
    println("\tCha mẹ thói đời \"ăn ở bạc\"")
    println("\tCó chồng hờ hững cũng như không")

}

fun bai2() {
    var a = 0.0
    var b = 0.0
    println("Nhập a:")
    var s = readLine()
    if (s != null) a = s.toDouble()
    println("Nhập b:")
    s = readLine()
    if (s != null) b = s.toDouble()
    println("Tổng: " + (a + b))
    println("Hiệu: " + (a - b))
    println("Tích: " + (a * b))
    println("Thương: " + (a / b))
}


class lab1 {
}