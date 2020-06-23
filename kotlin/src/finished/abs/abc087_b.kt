package finished.abs

fun main() {
    val a = readLine()?.toInt()!!
    val b = readLine()?.toInt()!!
    val c = readLine()?.toInt()!!
    val x = readLine()?.toInt()!!

    println(fun(): Int{
        if (x%50 != 0 || x > 500*a+100*b+50*c) return 0

        var count = 0
        for (i in 0..a) {
            for(j in 0..b) {
                for (k in 0..c) {
                    if (x == i*500+j*100+k*50) ++count
                }
            }
        }
        return count
    }())
}

