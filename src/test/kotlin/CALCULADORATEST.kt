import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class CALCULADORATEST {

    private final val CALCULADORATEST : CALCULADORA

        get() {
            TODO()
        }

    @Test
    fun somaTest() {
        assertEquals(3, CALCULADORATEST.soma(1,2))
    }

    @Test
    fun subtracaoTest() {
        assertEquals(1, CALCULADORATEST.subtracao(3,2))
    }


    @Test
    fun divisaoTest() {
        assertEquals(2, CALCULADORATEST.divisao(4,2))
    }

    @Test
    fun multplicacaoTest() {
        assertEquals(6, CALCULADORATEST.multiplicacao(2,3))
    }

}


