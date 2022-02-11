package Task2

import java.util.Scanner

fun main(){

    var reader = Scanner(System.`in`)

    println("enter a number")
   var number1 = reader.nextInt()

   println("enter number 2")
   var number2 = reader.nextInt()


   var temporay = number1

   number1 = number2

    number2 = temporay


    println(number1)
    println(number2)
    
}