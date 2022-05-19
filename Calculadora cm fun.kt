fun main() {

    println("Informe qual operação deseja fazer: \n 1 para Soma\n 2 para Subtração\n 3 para Multiplicação\n 4 para Divisão ")

    when(readln().toInt()){
        1 -> {
            println("Digite um número inteiro para somar: ")
            val num1 = readln().toDouble()

            println("Digite outro número inteiro para somar com $num1: ")
            val num2 = readln().toDouble()

            println("A soma entre $num1 e $num2 é igual a ${soma(num1, num2)}")

        }
        2 -> {
            println("Digite um número inteiro para subtrair: ")
            val num1 = readln().toDouble()

            println("Digite outro número inteiro para subtrair de $num1: ")
            val num2 = readln().toDouble()

            println("A subtração entre $num1 e $num2 é igual a ${sub(num1, num2)}")

        }
        3 -> {
            println("Digite um número inteiro para multiplicar: ")
            val num1 = readln().toDouble()

            println("Digite outro número inteiro para multiplicar $num1: ")
            val num2 = readln().toDouble()

            println("A multiplicação entre $num1 e $num2 é igual a ${mult(num1, num2)}")

        }
        4 -> {
            println("Digite um número inteiro para ser dividido: ")
            val num1 = readln().toDouble()

            println("Digite outro número inteiro para dividir $num1: ")
            val num2 = readln().toDouble()

            println("A divisão entre $num1 e $num2 é igual a ${div(num1, num2)}")

        }
        else -> println("Valor inválido")
    }

    }

fun soma(n1: Double, n2: Double): Double {
    return n1 + n2

}

fun sub (n1: Double, n2: Double): Double{
    val resultSub = n1 - n2
    return resultSub

}

fun mult (n1: Double, n2: Double): Double{
    val resultMult = n1 * n2
    return resultMult

}

fun div (n1: Double, n2: Double): Double{
    val resultDiv = n1 / n2
    return resultDiv

}