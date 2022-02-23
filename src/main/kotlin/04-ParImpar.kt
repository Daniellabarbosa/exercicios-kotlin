import java.lang.Math.sqrt
import kotlin.math.pow

fun main(){

    println("Digite um número: ")
    var num = readLine()!!.toDouble()

    if(num % 2 == 0.0)

        println("Esse é um número PAR e sua raiz quadradada é: ${sqrt(num)}")
    else{

        println("Esse é número IMPAR que elevado ao quadrado é igual a: ${num.pow(2)}")

    }
}