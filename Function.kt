import java.util.*

fun dayOfWeek(){

println("What day is it today?")

    val dayWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
//usa biblioteca Java para obter o dia da semana, ou outros dias de interesse, de acordo com o local e timezone.

    println (when (dayWeek){
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "Time is crazy"
    })
}

fun main(){

    dayOfWeek()
}
