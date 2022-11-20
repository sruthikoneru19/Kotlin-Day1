import java.util.*

fun main(args: Array<String>) {
    // InputStream to get Input
    var reader = Scanner(System.`in`)

    //Input Integer Value
    println("Enter the Year : ")
    var year = reader.nextInt();

    // checking leap year condition logic
    val isleap = if (year % 4 == 0){
        if (year % 100 == 0)
        {
            year % 400 == 0
        }
        else true
    }
    else false;

    println("$year is ${if (isleap) "Leap Year" else "Not a Leap Year"} ")
}