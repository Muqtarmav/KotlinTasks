package Task2


fun main() {

    var sum = 0

    var number = 0

    while (number < 100) {
        number++
        sum = sum + number
    }
    println(sum)

    //using range
    var digits = 1..7

    for (str in 1..7) {
        println(str)
    }

    var values = 10
    var total = 0

    for ( i in 1..values){
        print(i)
    }

    println()

    var numb = 10

   var result =  when (numb) {
        0 -> "number is equal to zero"
        -0 -> "number is less than 0"
        else -> "its a positive integer"
    }

        print("number is :" + result)


}
