fun main() {
    val (n, y) = readLine()!!.split(" ").map { it.toInt() }

    println(fun(): String {
        if (y%1000 != 0) return "-1 -1 -1"

        for (i in n downTo 0) {
            if (i*10000 > y) continue
            for (j in n-i downTo 0) {
                val k = n-i-j
                if (i*10000+j*5000+k*1000 == y) return "$i $j $k"
            }
        }
        return "-1 -1 -1"
    }())
}