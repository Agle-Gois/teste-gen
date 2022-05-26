package ExercHeranca

open class Animal (var especie: String, var idade: Int) {

    open fun caracteristicas(){
        println("")
    }

    open fun emitirSom(){
        println("Emitindo som:")
    }

    open fun deslocamento(){
        println("Se deslocando:")
    }

}