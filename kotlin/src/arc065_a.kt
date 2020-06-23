fun main() {
    var s = readLine()!!

    fun aaa(str: String): String {
        if (str.startsWith("dream")) {
            if (str.startsWith("dreamer")) {
                if (!str.startsWith("dreamera")) {
                    // dreamerであることが確定
                    return str.drop(7)
                }
            }
            // dreamであることが確定
            return str.drop(5)
        }
        if (str.startsWith("eraser")) return str.drop(6)
        if (str.startsWith("erase")) return str.drop(5)
        return "false"
    }

    do {
        s = aaa(s)
    }
    while (!(s == "" || s == "false"))

    if (s == "") println("YES")
    if (s == "false") println("NO")
}