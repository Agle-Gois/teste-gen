fun main(){
    val contaBanco = ContaBanco(
        "Henrique",
        "0000",
        "000-00",
        2000.00
    )

    contaBanco.saldo()

    println("Digite o valor do saque: ")
    val dindin = readln().toDouble()

    contaBanco.saque(dindin)

    contaBanco.saldo()

    println("Digite o valor do depósito: ")
    val dindindin = readln().toDouble()

    contaBanco.deposito(dindindin)

}
}