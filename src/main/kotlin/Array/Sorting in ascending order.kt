import java.util.Scanner
fun main(args: Array<String>) {
    //creating scanner object
    var sc = Scanner(System.`in`)

    //user input size
    print("Enter the length of string : ")
    var size = sc.nextInt()

    //user defined array
    var number = Array(size,{0})
    for (i in 0..size-1){
        print("Enter the value of $i :")
        number.set(i,sc.nextInt())
    }

    //sorting in ascending order
    number.sort()
    println("Array after sorting: ")

    //print sorted array
    for (i in number)
        print("$i ")
}
