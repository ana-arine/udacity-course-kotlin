
//Crie um programa com uma função que retorna uma mensagem do cookie da sorte (fortune cookie) que você possa imprimir.

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

    print("\nEnter your birthday: ")
    val birthday = readLine()?.toIntOrNull() ?: 1

//    val division = birthday % (listFortunes.size)
//    return (listFortunes[division])
    //or
    return listFortunes[birthday.rem(listFortunes.size)]

}

fun main() {

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

