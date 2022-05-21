fun main() {

    /*
    Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
    trabalhar com Collection do tipo List do Kotlin para manipular os dados desse
    estoque, o programa deverá atender as seguintes funcionalidades:

    Armazenar dados da List
    Remover dados da list;
    Atualizar dados da list.
    Apresentar todos os dados da list.
     */

    val produtos = mutableListOf<String>()

    while (true){

        println("Digite o número referente à ação: \n1 - adicionar produtos \n2 - remover produtos\n" +
        "3 - atualizar produtos\n4 - listar produtos\n0 - sair\n")

        print("opcao: ")

        when(readln().toInt()){
            1 -> {
                println("Adicionar produto")
                val novProd = readln()

                if (novProd != ""){
                    produtos.add(novProd)
                    println("produto $novProd adicionado com sucesso: \n")

                }else{
                    println("Digite um nome válido")
                }
            }

            2 -> {
                println("Digite o nome do produto para ser deletado")
                val delProd = readln()

                if (produtos.contains(delProd)){
                    produtos.remove(delProd)
                    println("Produto $delProd foi removido com sucesso!\n")
                }else{
                    println("O Produto $delProd não existe na lista\n")
                }

            }
            3 -> {

                println("Lista dos produtos\n")

                produtos.forEach {
                    println(it)
                }

                println("\nDigite o produto que quer atualizar: ")
                val atualProd = readln()

                if (produtos.contains(atualProd)){
                    val index = produtos.indexOf(atualProd)

                    println("Digite o novo produto: ")
                    val valor = readln()

                    produtos[index] = valor

                    println("O produto $valor foi atualizado com sucesso!")

                }else {
                    println("O Produto digitado não existe na lista\n")
                }

            }

            4 -> {
                println("Lista de produtos\n")

                produtos.forEach {
                    println(it)
                }

            }

            0 -> break

            else -> println("Valor inválido\n")

        }

    }

}