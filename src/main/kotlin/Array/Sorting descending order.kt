import java.util.Scanner
fun main(args: Array<String>) {
    //creating scanner object
    var sc = Scanner(System.`in`)

    //user input size
    print("Enter the size of Array: ")
    var size = sc.nextInt()

    //user defined array
    var marks = Array(size,{0})
    for (i in 0..size-1){
        print("Enter the value of $i : ")
        marks.set(i,sc.nextInt())
    }

    //sorting in descending order
    marks.sortDescending()

    //print sorted array
    for (i in marks){
        print("$i ")

    }
}