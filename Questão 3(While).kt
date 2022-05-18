fun main(){

    //Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
    //21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
    //idade for =-99.

    var soma50 = 0.0
    var soma21 = -1.0
    var idade = 0.0

    while (idade != -99.0){
        print("Digite a idade da pessoa: ")
        idade = readln().toDouble()
        if (idade < 21)
        soma21 ++
        else if(idade > 50)
            soma50 ++
    }
    println("O total de pessoas com menos de 21 anos é $soma21 ")
    println("O total de pessoas com mais de 50 anos é $soma50 ")


}