package Task2
import java.util.Scanner

class math{
    infix fun sum(n : Int): Int{
        val num = n + n
        return num
    }


    fun displayBorder(character: Char = '=', length:Int = 15){
        for (i in 1..length){
            println(character)
        }
    }
}

fun main(){

    val m = math()
    val result = m sum 3
    println("the sum of the number is " + result)

    println("output when no argument is passed")
    displayBorder()


    println("\n\n'*' is used as first argument" )
    println("output when both argument are passed")
    displayBorder('*')

    println("\n\n'*' is used as first argument" )
    println("5 is used as second argument")
    println("output when both argument are passed")
    displayBorder('*', length = 5)

    displayBorder('+')

}