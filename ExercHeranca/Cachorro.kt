package ExercHeranca

open class Cachorro(especie: String, idade: Int) : Animal(especie, idade){

    override fun caracteristicas() {
        super.caracteristicas()
        println("Animal $especie com $idade anos de idade" )

    }

    override fun emitirSom() {
        super.emitirSom()
        println("Au Au")

    }

    override fun deslocamento() {
        super.deslocamento()
        println("Correndo")
    }

}