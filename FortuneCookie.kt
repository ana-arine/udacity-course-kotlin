
//Crie um programa com uma função que retorna uma mensagem do cookie da sorte (fortune cookie) que você possa imprimir.



fun getBirthday() : Int {

    print("\nEnter your birthday: ")
    val birthday = readLine()?.toIntOrNull() ?: 1
    return (birthday)

}

fun getFortuneCookie() : String {

    val listFortunes : List<String> = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )



//    val division = getBirthday() % (listFortunes.size)
//    return (listFortunes[division])
    //or
//    return listFortunes[getBirthday().rem(listFortunes.size)]

    return (when (getBirthday()) {
        in 1..5 -> listFortunes[0]
        in 6..10 -> listFortunes[1]
        in 11..15 -> listFortunes[2]
        in 16..20 -> listFortunes[3]
        in 21..25 -> listFortunes[4]
        in 26..30 -> listFortunes[5]
        else -> listFortunes[6]
    })

}

fun main(args: Array<String>) {

    var fortune: String

    for (i in 1..10) {
        fortune = getFortuneCookie()
        println("Your fortune is: $fortune")
        if (fortune.contains("Take it easy"))
            break
        }
    }

    //or just   println("Your fortune is: ${getFortuneCookie()}")

    // Prática extra:
    //
    //Use um loop for que execute o código até o máximo de 10 vezes ou até que a fortuna "Take it easy" seja encontrada.


//Another solution:
//
//fun getBirthday(): Int {
//    print("\nEnter your birthday: ")
//    return readLine()?.toIntOrNull() ?: 1
//}
//
//fun getFortune(birthday: Int): String {
//    val fortunes = listOf("You will have a great day!",
//        "Things will go well for you today.",
//        "Enjoy a wonderful day of success.",
//        "Be humble and all will turn out well.",
//        "Today is a good day for exercising restraint.",
//        "Take it easy and enjoy life!",
//        "Treasure your friends, because they are your greatest fortune.")
//    val index = when (birthday) {
//        in 1..7 -> 4
//        28, 31 -> 2
//        else -> birthday.rem(fortunes.size)
//    }
//    return fortunes[index]
//}