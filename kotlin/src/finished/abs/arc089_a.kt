package finished.abs

fun main() {
    val n = readLine()!!.toInt()
    val lines = arrayOfNulls<String>(n)
    for (i in lines.indices) {
        lines[i] = readLine()!!
    }

    fun aaa(t: Int, x: Int, y: Int): Boolean {
        val sum = x+y
        if (sum > t) return false
        if (t%2 == 0) {
            return (sum%2 == 0)
        }
        return (sum%2 != 0)
    }

    var result = true
    var beforeT = 0
    var beforeX = 0
    var beforeY = 0
    for (i in 0 until n) {
        val (t, x, y) = lines[i]!!.split(" ").map { it.toInt() }

        if (aaa(t-beforeT, x-beforeX, y-beforeY)) {
            beforeT = t
            beforeX = x
            beforeY = y
        } else {
            result = false
            break
        }
    }
    if (result) {
        println("Yes")
    } else {
        println("No")
    }
}