import java.util.*

fun main(args:Array<String>)
{
    var reader = Scanner(System.`in`)

    // Input Integer Value
    println("Enter Number : ")
    var number = reader.nextInt()

    var factorial: Long=1

    for(i in 1..number){
        // Calculate Factorial
        factorial*=i.toLong()
    }
    println("Factorial of $number is $factorial ")
}