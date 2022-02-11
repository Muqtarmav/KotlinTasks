import java.util.Scanner

fun main(){

    var reader = Scanner(System.`in`)

    println("enter a number")
    var number = reader.nextInt()
    //var number = 4

    for (i in 1..10){

        var product = number * i
        println("$number * $i = $product")
    }


    }
