import java.lang.Math.sqrt
import kotlin.math.pow

fun main(){

    //Faça um programa em que permita a entrada de um número qualquer e exiba se este
    //número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
    //ímpar exiba o número elevado ao quadrado.

    println("Digite um número: ")
    val num1 = readln().toDouble()

    if (num1 % 2 == 0.0){
        println("Número $num1 é par e a raíz quadeada é: ${"%.2f".format(sqrt(num1))}")

    }else{
        println("O número $num1 é impar e ele elevado ao quadrado é: ")
        print("%.2f".format(num1.pow(n = 2)))
    }


}