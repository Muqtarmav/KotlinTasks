import java.util.Scanner

fun main(){

    var  reader = Scanner(System.`in`)

    println("enter letter")
    val chr = reader.next().single()
    val ascii  = chr.toInt()




    println(ascii)

}