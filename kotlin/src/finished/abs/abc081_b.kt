package finished.abs

fun main() {
    val n = readLine()
    val an = readLine()!!.split(" ")
    val _an = an.map { it.toInt() }

    var loopn = 0
    var __an = _an
    var i = 0
    while(i < 1000000000) {
        if(__an.all { it % 2 == 0}) {
            __an = __an.map { it/2 }
            loopn++
        } else {
            break
        }
    }
    println(loopn)
}