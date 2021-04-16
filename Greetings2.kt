
fun main(args: Array<String>) {

    println(if (args[0].toInt() < 12) "Good morning, Kotlin." else "Good night, Kotlin.")
//or
    println("${if (args[0].toInt() < 12) "Good Morning, Kotlin" else "Good Night, Kotlin"}")
}