package Task2

fun main(){

    var result = recursiveSum(10000)
    print(result)
}

fun recursiveSum(n : Long) : Long{
    return if (n <= 1) {
        n
    }
    else {
        n  + recursiveSum(n - 1)
    }

}

