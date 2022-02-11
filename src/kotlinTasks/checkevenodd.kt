package kotlinTasks

import java.util.Scanner

fun main(){

    var reader = Scanner(System.`in`)

    println("enter first number")

    var number1 = reader.nextInt()

    //var result

    when(number1 % 2 == 0) {
        true -> println("is even")
        else-> println("is false")
    }

    }

//    if (number1 % 2 == 0){
//        println("number is even")
//    }
//    else {
//        println("number is odd")
//    }

