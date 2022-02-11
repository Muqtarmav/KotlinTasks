package Task2

fun main() {


    val number = 4
    var result: Long


    result = factorial(number)
    println("factorial of a $number = $result")
}



    fun factorial(n : Int) : Long{
    return if (n == 1)n.toLong()
    else n * factorial(n-1)
}



