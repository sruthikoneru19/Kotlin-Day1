fun main(args: Array<String>) {
    val rows = 3

    for (i in 1..rows) {
        for (j in 1..i) {
            print("* ")
        }
        println()
    }
}