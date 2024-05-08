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

    println("bài 2:/n")
    bai2()
    println("bài 3:/n")
    bai3()
    println("bài 4:/n")
    println("Ví dụ 1:/n")
    vd1()
    println("Ví dụ 2:/n")
    vd2(4)
    println("Ví dụ 3:/n")
    vd3()
    println("Ví dụ 4:/n")
    vd4()
    println("Ví dụ 5:/n")
    vd5()
    println("Ví dụ 6:/n")
    vd6()
    println("Ví dụ 7:/n")
    vd7()
    println("Ví dụ 8:/n")
    vd8()
    println("Ví dụ 9:/n")
    vd9()
    println("Ví dụ 10:/n")
    vd10()

}

fun phepChia(a:Float, b:Float ): Float {
    if ( b == 0f){
        return 0f
    }
    val c = a / b

    return c

}

fun bai2() {

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

fun bai3() {
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

    // Bài 4

    fun vd1() {
        cases("Hello")
        cases(1)
        cases(0L)
        cases(lab1())
        cases("hello")
    }
fun cases(obj: Any) {
    when (obj) {                                     // 1
        1 -> println("One")                          // 2
        "Hello" -> println("Greeting")               // 3
        is Long -> println("Long")                   // 4
        !is String -> println("Not a string")        // 5
        else -> println("Unknown")                   // 6
    }
}
fun eatACake() = println("Ăn bánh")
fun bakeACake() = println("Nướng bánh")

fun vd2(cakesToEat: Int) {
    var cakesEaten = 0
    var cakesBaked = 0

    while (cakesEaten < cakesToEat) {
        eatACake()
        cakesEaten++
    }

    do {
        bakeACake()
        cakesBaked++
    } while (cakesBaked < cakesEaten)
}


data class User(val name: String, val id: Int) {           // 1
    override fun equals(other: Any?) =
        other is User && other.id == this.id               // 2
}
fun vd3() {
    val user = User("Alex", 1)
    println(user)                                          // 3

    val secondUser = User("Alex", 1)
    val thirdUser = User("Max", 2)

    println("user == secondUser: ${user == secondUser}")   // 4
    println("user == thirdUser: ${user == thirdUser}")

    // hashCode() function
    println(user.hashCode())                               // 5
    println(secondUser.hashCode())
    println(thirdUser.hashCode())

    // copy() function
    println(user.copy())                                   // 6
    println(user === user.copy())                          // 7
    println(user.copy("Max"))                              // 8
    println(user.copy(id = 3))                             // 9

    println("name = ${user.component1()}")                 // 10
    println("id = ${user.component2()}")
}

enum class State {
    IDLE, RUNNING, FINISHED                           // 1
}

fun vd4() {
    val state = State.RUNNING                         // 2
    val message = when (state) {                      // 3
        State.IDLE -> "It's idle"
        State.RUNNING -> "It's running"
        State.FINISHED -> "It's finished"
    }
    println(message)
}

fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {  // 1
    return operation(x, y)                                          // 2
}

fun sum(x: Int, y: Int) = x + y                                     // 3

fun vd5() {
    val sumResult = calculate(4, 5, ::sum)                          // 4
    val mulResult = calculate(4, 5) { a, b -> a * b }               // 5
    println("sumResult $sumResult, mulResult $mulResult")
}

val systemUsers: MutableList<Int> = mutableListOf(1, 2, 3)        // 1
val sudoers: List<Int> = systemUsers                              // 2

fun addSystemUser(newUser: Int) {                                 // 3
    systemUsers.add(newUser)
}

fun getSysSudoers(): List<Int> {                                  // 4
    return sudoers
}

fun vd6() {
    addSystemUser(4)                                              // 5
    println("Tot sudoers: ${getSysSudoers().size}")               // 6
    getSysSudoers().forEach {                                     // 7
            i -> println("Some useful info on user $i")
    }
    // getSysSudoers().add(5) <- Error!                           // 8
}
fun printMessage(message: String): Unit {                               // 1
    println(message)
}

fun printMessageWithPrefix(message: String, prefix: String = "Info") {  // 2
    println("[$prefix] $message")
}

fun multiply(x: Int, y: Int) = x * y                                    // 4

fun vd7() {
    printMessage("Hello")                                               // 5
    printMessageWithPrefix("Hello", "Log")                              // 6
    printMessageWithPrefix("Hello")                                     // 7
    printMessageWithPrefix(prefix = "Log", message = "Hello")           // 8
    println(sum(1, 2))                                                  // 9
    println(multiply(2, 4))                                             // 10
}
class Customer                                  // 1

class Contact(val id: Int, var email: String)   // 2

fun vd8() {

    val customer = Customer()                   // 3

    val contact = Contact(1, "mary@gmail.com")  // 4

    println(contact.id)                         // 5
    contact.email = "jane@gmail.com"            // 6
}
class Animal(val name: String)

class Zoo(val animals: List<Animal>) {

    operator fun iterator(): Iterator<Animal> {             // 1
        return animals.iterator()                           // 2
    }
}

fun vd9() {

    val zoo = Zoo(listOf(Animal("zebra"), Animal("lion")))

    for (animal in zoo) {                                   // 3
        println("Watch out, it's a ${animal.name}")
    }

}

fun vd10(){
    for (c in 'a'..'d') {        // 1
        print(c)
    }
    print(" ")

    for (c in 'z' downTo 's' step 2) { // 2
        print(c)
    }
    print(" ")
}
class lab1 {
}
