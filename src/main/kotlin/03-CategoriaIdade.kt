fun main (){


    println("Digite a sua idade: ")
    val idade = readln()!!.toInt()

    when(idade){

        in 10..14 -> println("Sua categoria é: INFANTIL")
        in 15..17 -> println("Sua categoria é: JUVENIL")
        in 18..25 -> println("Sua categoria é: ADULTO")

        else -> println ("Não há categoria para sua idade")

    }
}
