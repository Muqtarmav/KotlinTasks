import java.util.Scanner;

fun main(){


    var reader  = Scanner(System.`in`)

    println("enter number")
    var number1 = reader.nextInt()

    println("enter number2")
    var number2 = reader.nextInt()

    var result = number1 / number2


    var remainder = number1 % number2

    println("quotient is " +result)

    println("remainder is " + remainder)

}
