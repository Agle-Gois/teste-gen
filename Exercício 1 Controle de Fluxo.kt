fun main(){

    //Faça um programa que receba três inteiros e diga qual deles é o maior.


    println("Digite um número inteiro: ")
    print("Resposta: ")

    val num1 = readln().toInt()

    println("Digite outro inteiro: ")
    print("Resposta: ")

    val num2 = readln().toInt()

    println("Digite outro inteiro: ")
    print("Resposta: ")

    val num3 = readln().toInt()

    if (num1 > num2 && num1 > num3 ){
        println("O inteiro maior é o: $num1")

    }else if(num2 > num1 && num2 > num3 ){
        println("O inteiro maior é o: $num2")

    }else if(num3 > num2 && num3 > num1){
        println("O inteiro maior é o: $num3")
    }




    /*
    println("O seu nome é Henrique?")
    print("Resposta: ")
    val opa = readln()

    if(opa == "Sim" || opa == "sim"){

        println("Beleza mano, vlw")

    }else{

        println("Ah, ok")
*/


}