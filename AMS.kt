import java.util.*

fun main(args: Array<String>) {
    println("Hello, ${args[0]}")

    println(feedTheFish())
}

fun shouldChangeWater(
    day: String,
    temperature: Int = 22,
    dirty: Int = 20) : Boolean {
return true
}

//fun shouldChangeWater2(
//    temperature: Int = 22,
//    dirty: Int = 20,
//    day: String
//) {
//}


fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish are going to eat $food.")
    //3 ways to call the function:
    shouldChangeWater(day, 50, 50)  //using all the 3 arguments in the right order.
    shouldChangeWater(day)  //calling only the required argument and use the default values for temp. and dirty.
    shouldChangeWater(day, dirty=50)  //set one or any of the values by specifying the name of the argument. This is the more readable form when the function has many arguments.

    swim( 50, speed = "slow")
}

fun swim(time: Int, speed: String = "fast"){
    println("swimming $speed")
}


fun randomDay() : String {
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(7)]  //conta de 0 a 6. 7 é o bound e será excluído.
}

fun fishFood (day : String) : String {

   return when (day) {
        "Monday" -> "flakes"
        "Tuesday" -> "pellets"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Saturday" -> "lettuce"
        "Sunday" -> "plankton"
       else -> "spirulina"
    }


}