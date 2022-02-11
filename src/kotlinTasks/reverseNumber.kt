package kotlinTasks

import java.util.Scanner

    fun main() {

        var reader =  Scanner(System.`in`)

        println("enter number")
        var number = reader.nextInt()

        var value = intArrayOf(number)


        var count = 3
        while (count < value.size) {
            print(value[count])
            count--
        }
    }

//
//        for (str in number){
//            println(str)
//            number
//        }

