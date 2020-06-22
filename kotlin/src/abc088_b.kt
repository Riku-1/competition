fun main() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }
    val _a = a.sortedDescending()

    var alice = 0
    var bob = 0
    for(i in 0 until n step 2) {
        alice += _a[i]
    }
    for(i in 1 until n step 2) {
        bob += _a[i]
    }
    println(alice-bob)
}