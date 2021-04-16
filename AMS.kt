import java.util.*

fun main(args: Array<String>) {
    println("Hello, ${args[0]}")

    println(feedTheFish())
}

fun feedTheFish() {
    val day = randomDay()
    val food = "pellets"
    println("Today is $day and the fish are going to eat $food.")
}

fun randomDay() : String {
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(7)]  //conta de 0 a 6. 7 é o bound e será excluído.
}
