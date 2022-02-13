package Task2

fun main() {
//
//    fun multiplyValue(value : Int, value2 : Int): Int {
//        return value * value2;
//       // println("$value * $value2 = ${value * value2}" )
//    }

    fun multiplyAndDivide(value : Int, value2 : Int): Pair<Int, Int>{
        return Pair(value * value2 , value / value2)
    }

    println(multiplyAndDivide(2, 3))
}