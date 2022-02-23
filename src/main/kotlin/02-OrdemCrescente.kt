fun main (){


    var crescente = 0
    println("Digite três números aleatórios e veja qual a sua ordem crescente")

    print("Digite o primeiro número:")
    var num1 = readLine()!!.toInt()
    print("Digite o segundo número")
    var num2 = readLine()!!.toInt()
    print("Digite o terceiro número")
    var num3 = readLine()!!.toInt()

    if(num1 > num2){

        crescente=num1
        num1 = num2
        num2 = crescente
    }
    if (num2 > num3){
        crescente=num2
        num2 = num3
        num3 = crescente
    }
    if(num1>num3){
        crescente = num1
        num1 = num3
        crescente = num3

    }
    println("A ordem crescente dos números digitados é: $num1,$num2,$num3")

}
