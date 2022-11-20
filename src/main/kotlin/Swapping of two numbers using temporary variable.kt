fun main()
{
    var first = 3.32f
    var second = 9.74f

    println("Before swapping")
    println("First number = $first")
    println("Second number = $second")

    // Value of first is assigned to temp
    val temp = first

    // Value of second is assigned to first
    first = second

    // Value of temp
    second = temp

    println("After swapping")
    println("First number = $first")
    println("Second number = $second")
}