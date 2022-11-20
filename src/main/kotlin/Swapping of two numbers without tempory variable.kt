fun main()
{
    var first = 78.6f
    var second = 132.0f

    println("Before swapping")
    println("First number = $first")
    println("Second number = $second")

    //logic
    first = first - second
    second = first + second
    first = second - first

    println("After swapping")
    println("First number = $first")
    println("Second number = $second")
}