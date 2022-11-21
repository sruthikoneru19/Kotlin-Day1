import java.util.Scanner
fun main(args: Array<String>) {
    var sc = Scanner(System.`in`)
    print("Enter the size of array: ")
    var size = sc.nextInt()
    var sum = 0
    var arr = Array(size,{0})
    for (i in 0.. size-1){
        print("Enter the value of $i : ")
        arr.set(i,sc.nextInt())
    }
    for (i in 0..size-1){
        sum = sum + arr[i]
    }
    println("Sum of the array is : $sum")
}