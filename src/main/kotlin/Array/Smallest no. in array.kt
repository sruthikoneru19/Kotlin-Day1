import java.util.Scanner
fun main(args: Array<String>) {
    var sc = Scanner(System.`in`)

    print("Enter the size of Array: ")
    var size = sc.nextInt()

    var num = Array(size, { 0 })
    var largest = num[0]

    for (i in 0..size - 1) {
        print("Enter the value of $i : ")
        num.set(i, sc.nextInt())
    }
    //1st Method
    for (i in num) {
        if (largest < i)
            largest = i
    }
    num.sort()
    println("Smallest number in array is ${num.first()}")
}