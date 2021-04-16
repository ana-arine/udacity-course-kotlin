//Exemplo básico
//
//    Crie um array integer de números chamado numbers, de 11 a 15.
//    Crie uma lista imutável vazia para Strings.
//    Escreva um loop for que faça um loop sobre o array e adicione a representação de string de cada número da lista.


fun main() {
//
//    val array: Array<Int> = arrayOf(11, 12, 13, 14, 15)
//    val list: List<String> = listOf()
//
//    for ((i, value) in array.withIndex()) {
//        println("${value.toLong()} = $list{[i]}")
//    }



    //Exemplo de desafio
    //
    //    Como você pode usar um loop for para criar (uma lista de) números entre 1 e 100 que sejam divisíveis por 7?


//    for (i in 0..100 step 7){
//        println(i.toString() + " - ")
//    }
//
    var list3 : MutableList<Int> = mutableListOf()
    for (i in 0..100 step 7) list3.add(i)
    print(list3)
    // [0, 7, 14, 21, 28, 35, 42, 49, 56, 63, 70, 77, 84, 91, 98]
    }

