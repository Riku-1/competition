package finished.abs

fun main() {
    val n = readLine()!!.toInt()
    val d = arrayOfNulls<Int>(n)
    for(i in 0 until n) {
        d[i] = readLine()!!.toInt()
    }
    println(d.distinct().size)
}
