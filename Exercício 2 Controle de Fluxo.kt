fun main(){

    //Faça um programa que entre com três números e coloque em ordem crescente.


    println("Digite um número")
    val num1 = readln().toDouble()

    println("Digite outro número")
    val num2 = readln().toDouble()

    println("Digite outro número")
    val num3 = readln().toDouble()

    if (num1 <= num2 && num2 <= num3){
        println("$num1; $num2; $num3")

    }else if (num1 <= num3 && num3 <= num2){
        println("$num1; $num3; $num2")

    }else if (num2 <= num1 && num1 <= num3){
        println("$num2; $num1; $num3")

    }else if(num2 <= num3 && num3 <=num1){
        println("$num2; $num3; $num1")

    }else if(num3 <= num1 && num1 <= num2){
        println("$num3; $num1; $num2")

    }else {
        println("$num3; $num2; $num1")

    }




    /*
    if (num1 > num2 && num1 > num3 && num2 > num3) {
        println("$num3; $num2; $num1")

    }else if (num2 > num1 && num2 > num3 && num1 > num3){
            println("$num3; $num1; $num2")

    }else if (num3 > num1 && num3 > num2 && num3 > num1){
        println("$num1; $num3; $num1")}
    */


}