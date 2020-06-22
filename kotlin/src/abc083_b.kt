fun main() {
    val (n, a, b) = readLine()!!.split(" ").map { it.toInt() }

    var sum = 0
    for (i in 1..n) {
        var isum = 0
        val _i = i.toString()
        for (k in _i) {
            isum += k.toString().toInt()
        }
        if (isum in a..b) sum +=i
    }
    println(sum)
}
