package ExercHeranca

class Preguica(especie: String, idade: Int) : Animal(especie, idade){

    override fun caracteristicas() {
        super.caracteristicas()
        println("Animal $especie com $idade anos de idade" )

    }

    override fun emitirSom() {
        super.emitirSom()
        println("Aaaaaaahh que preguiça boa")

    }

    override fun deslocamento() {
        super.deslocamento()
        println("Descansando")
    }

}