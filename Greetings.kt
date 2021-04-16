import java.util.*

fun main(args: Array<String>) {
    println("Hello, ${args[0]}")  //Run -> Edit Configurations


val isUnit = println("This is an expression")
    println(isUnit)

    val temperature = 10
    val isHot = if (temperature > 40) true else false
    println(isHot)

    val message = "The fish is ${ if (temperature > 40) "fried" else "safe" }."
    println(message)


}
