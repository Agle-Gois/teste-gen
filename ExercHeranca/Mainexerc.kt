

    /*
     Crie uma hierarquia de classes conforme abaixo com os seguintes atributos
     e comportamentos (observe a tabela), utilize os seus conhecimentos e
     distribua as características de forma que tudo o que for comum a todos
     os animais fique na classe Animal:
     */

    import ExercHeranca.Cachorro
    import ExercHeranca.Cavalo
    import ExercHeranca.Preguica

    fun main(){


        val cachorro = Cachorro("Cão Pitbull", 7,)
        val cavalo = Cavalo("Cavalo Andaluz", 20)
        val preguica = Preguica("Preguiça Real", 30)

        cachorro.caracteristicas()
        cachorro.emitirSom()
        cavalo.caracteristicas()
        cavalo.emitirSom()
        preguica.caracteristicas()
        preguica.emitirSom()
        println("\nAnimais e seus sons")

    }

