import java.util.Scanner
fun main(args: Array<String>) {
    var sc = Scanner(System.`in`)

    print("Enter the size of array: ")
    var size = sc.nextInt()

    var num = Array(size,{0})
    for(i in 0..size-1){
        print("Enter the value of $i : ")
        num.set(i,sc.nextInt())
    }

    num.sort()

    var SecondLargest =0
    for (i in 0..size-2){
        if (num[i] != num[size-1]){
            SecondLargest = num[i]
        }
    }
    println("Second largest element in the array is : $SecondLargest")
}