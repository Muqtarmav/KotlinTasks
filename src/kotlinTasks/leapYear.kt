import java.util.Scanner

fun main(){

    var reader = Scanner(System.`in`)

    println("enter a year")
    var year = reader.nextInt()

    if ( year % 4 == 0 || year % 400 == 0){
        println("its a leap year")
    }

    else {
        println("not a leap year")
    }

}