package calculadoraTest

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class CacauTest{

    @Test
    fun somaTest(){

        assertEquals(20, Cacau.soma(10, 10))
    }

    @Test
    fun multTest(){

        assertEquals(20, Cacau.mult(10, 2))
    }

    @Test
    fun divisaoTest(){

        assertEquals(10, Cacau.divisao(20, 2))
    }

    @Test
    fun subtracaoTest(){

        assertEquals(20, Cacau.subtracao(30, 10))
    }

    @Test
    fun potenciaTest(){

        assertEquals(8, Cacau.potencia(2, 2))
    }

    @Test
    fun raizTest(){

        assertEquals(12.0, Cacau.raiz(144.0))
    }

}