package Task2

fun main(){

    var newList = mutableListOf<String>("red", "blue", "white", "yello")

    if (newList.size < 2){
        print("cant be less than 2")
    }
    newList.add("browm")

    println(newList)
   print( newList.get(2))


    for ( str in newList){
        println(newList)
    }

    println()



    println(newList[2])

    var result = newList.first()
    println(result)

    var result2 = newList.last()
    println(result2)
}