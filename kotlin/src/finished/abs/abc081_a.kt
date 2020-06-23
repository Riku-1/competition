package finished.abs

fun main() {
    val input = readLine()
    var count = 0

    input?.forEach { if (it == '1') count++  }

    println(count)
}