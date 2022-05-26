package ExercHeranca

class Cavalo(especie: String, idade: Int) : Animal(especie, idade){

    override fun caracteristicas() {
        super.caracteristicas()
        println("Animal $especie com $idade anos de idade" )

    }

    override fun emitirSom() {
        super.emitirSom()
        println("hinn in in")

    }

    override fun deslocamento() {
        super.deslocamento()
        println("galopando")
    }

}