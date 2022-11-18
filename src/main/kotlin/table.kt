import java.util.Scanner
fun main() {
    var sc = Scanner(System.`in`)
    print("Enter the table you want to print : ")
    var tableName = sc.nextInt()

    print("Enter the limit you want to print : ")
    var tableLimit = sc.nextInt()

    for (i in 1 .. tableLimit){
        var product =tableName*i
        println("$tableName * $i = $product" )
    }
}