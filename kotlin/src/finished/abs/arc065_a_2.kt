package finished.abs

fun main() {
    val s = readLine()!!
    var _s = s.reversed()

    val slist = listOf("maerd", "remaerd", "esare", "resare")

    do {
        _s = fun(): String {
            slist.forEach { if (_s.startsWith(it)) return _s.drop(it.length)}
            return "false"
        }()
    }
    while (!(_s == "" || _s == "false"))

    if (_s == "") println("YES")
    if (_s == "false") println("NO")
}