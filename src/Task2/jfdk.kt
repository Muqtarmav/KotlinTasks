package Task2

fun main(){

    var number = 100000.toLong()
    var result = recursiveSum_(number)
    println("sum of upto $number number = $result")
}


tailrec fun recursiveSum_(n : Long, semiresult : Long = 0) : Long{
    return if (n <= 1) {
        semiresult
    }

    else {
        recursiveSum_((n - 1), n + semiresult)
    }


}
