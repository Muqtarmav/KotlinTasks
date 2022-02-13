package Task2

fun main(){

    var number = 10

   val answer = when (number % 2 == 0){
        true -> "its is even"
        else -> "its false"
    }

    println(answer)


    var timeOfDay = 15

    var period = when (timeOfDay){
        1, 2, 3, 4, 5, 6 -> "early morning"
        7, 8, 9, 10, 11 -> "morning"
        12, 13, 14, 15, 16, 17 -> "afternoon"
        18, 19, 20, 21, 22, 23 -> "evening"

        else -> "invalid hour"
    }

        println(period)

}