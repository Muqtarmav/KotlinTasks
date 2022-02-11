fun main(args: Array<String>) {

    var first = 4
    var second = 2

    println("First number = $first")
    println("Second number = $second")

    val temporary = first

    first = second

    second = temporary

    println("First number = $first")
    println("Second number = $second")
}