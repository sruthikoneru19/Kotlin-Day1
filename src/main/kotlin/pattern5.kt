//* * * * *
//*       *
//*       *
//*       *
//* * * * *

fun main() {
    var len = 5
    var breadth = 5
    for (i in 1.. len){

        for(j in 1.. breadth){

            if(i == 1 || i == len || j == 1 || j== breadth)
                print("*")
            else
                print(" ")
        }
        println()
    }
}