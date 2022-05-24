package exercicio

class Cliente(
    private var nome: String) {

    private var endereco = ""
    private var telefone = ""

    private val ListCompras = mutableListOf<String>()

    init {
        if (nome == "") {
            Exception("A classe foi instanciada da mandeira incorreta")
        }
    }
    // Costrutores

    constructor(nome: String, endereco: String) : this(nome) {
        this.endereco = endereco
    }

    constructor(nome: String, endereco: String, telefone: String)
            : this(nome, endereco) {
        this.telefone = telefone
    }

    fun addCompra(compra: String) {
        if (compra != "") {
            ListCompras.add(compra)
            println("\nItem adicionado")

        } else {
            println("\nO item não pode ser vazio")
        }

    }

    fun removeCompra(compra: String) {
        if (ListCompras.contains(compra)) {
            ListCompras.remove(compra)
            println("")
        }

    }
}