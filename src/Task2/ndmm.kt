package Task2

fun main(){
    fun myFunction(value : Int, value3 : Int) : Int{

        return value * value3

       // println("$value * $value3 = ${value * value3}")
    }

    println(myFunction(3, 6))

    var number : Int? = 40

    var result = number!! + 1
    println(result)

    if (number != null) {
        println(number + 1)
    }
}