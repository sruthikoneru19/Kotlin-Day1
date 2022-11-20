import java.util.*

fun isArmStrongNo(number: Long): Boolean
{
    var isArmNumber = false
    var res : Long= 0
    var original = number

    // Count No Digits in numbers
    val digits = original.toString().length

    while (original > 0)
    {
        val r = original % 10
        res +=Math.pow(r.toDouble(), digits.toDouble()).toLong()
        original /= 10
    }

    if (res == number)
    {
        isArmNumber = true
    }
    return isArmNumber
}
// Main Function, Entry Point of Program
fun main(arg: Array<String>)
{
    val sc = Scanner(System.`in`)

    // Input
    println("Enter Number  : ")
    val num: Long = sc.nextLong()


    if (isArmStrongNo(num))
        println("$num is an Armstrong Number")
    else
        println("$num is not an Armstrong Number")
}