

fun main(args: Array<String>) {
    println(whatShouldIDoToday("happy"))
    println(whatShouldIDoToday("happy", "sunny"))
    println(whatShouldIDoToday("sad"))
    print("How do you feel? ")
    println(whatShouldIDoToday(readLine()!!))
}


//fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24) : String {
//    return when {
//        mood == "happy" && weather == "sunny" -> "Go for a walk."
//        mood == "sad" && weather == "rainy" && temperature == 0 -> "Stay in bed."
//        temperature > 35 -> "Go swimming."
//        mood == "super happy" -> "Call your friends."
//        else -> "Stay home and read a book."
//    }
//}

//fun happyAndSunny(mood == "happy", weather == "sunny") = println("Go for a walk.")

fun isVeryHot (temperature: Int) = temperature > 35

fun isSadRainyCold (mood: String, weather: String, temperature: Int) =
    mood == "sad" && weather == "rainy" && temperature == 0

fun isHappySunny (mood: String, weather: String) = mood == "happy" && weather == "sunny"

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24) : String {
    return when {
        isVeryHot(temperature) -> "Go swimming!"
        isSadRainyCold(mood, weather, temperature) -> "Stay in bed."
        isHappySunny(mood, weather) -> "Go for a walk!"
        else -> "Stay home and read."
    }
}