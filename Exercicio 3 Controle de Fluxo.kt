fun main(){

    /*
    Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
 10-14 infantil
 15-17 juvenil
 18-25 adulto
        */
    println("Digite sua idade: ")
    val idade = readln().toInt()

    when(idade){
    in 10..14 -> println("Infantil")
    in 15..17 -> println("Juvenil")
    in 18..25 -> println("Adulto")
    in 26..99999 -> println("Idade inválida")

    }



    /*

    when(mes){

        in 1..3 -> {
            println("Mês quente")
            println("Melhores meses de todos!")

        }
        in 4..6 -> println("Mês mais ou menos...")
        in 7..9 -> println("Mês FRIO")
        in 10..12 -> println("Mês dahora")

        else -> println("Mês inválido")
    */


}