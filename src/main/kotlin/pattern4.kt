//A
//B B
//C C C

fun main(args: Array<String>) {
    val last = 'C'
    var alphabet = 'A'

    for (i in 1..last - 'A' + 1) {
        for (j in 1..i) {
            print("$alphabet ")
        }
        ++alphabet

        println()
    }
}