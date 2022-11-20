import java.util.Scanner
fun main()
{
    var num: Int
    var reverse: Int = 0
    val scanner = Scanner(System.`in`)

    //Taking input
    print("Enter a number : ")
    num = scanner.nextInt()

    // logic
    while (num != 0)
    {
        reverse = reverse * 10 + num % 10;
        num /= 10;
    }
    println("Reverse number is : $reverse")
}