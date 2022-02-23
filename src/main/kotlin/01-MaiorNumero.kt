fun main () {


        println("Digite três números e veja qual deles é o maior")

        var maior: Int = 0

        print("Digite o primeiro número:")
        var num1 = readLine()!!.toInt()
        print("Digite o segundo número:")
        var num2 = readLine()!!.toInt()
        print("Digite o terceiro númeroº:")
        var num3 = readLine()!!.toInt()



    maior = num1
    if(maior < num2){
        maior = num2
    }
    if(maior < num3){
        maior = num3
    }
    println( "$maior é o maior número entre os três digitados")

}