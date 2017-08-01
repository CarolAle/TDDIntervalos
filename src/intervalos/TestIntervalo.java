package intervalos;
import static org.junit.Assert.*;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestIntervalo {

	@Test
	public void testTipoInt() {
		int[] numeros = {1, 2, 3};
		Intervalos intervalo = new Intervalos(numeros);
		assertTrue(intervalo.getNumeros() != null);
	}
    @Test
	public void testNotNull() {
		int[] numeros = {};
        Intervalos intervalo = new Intervalos(numeros);
		assertNotNull(numeros);
	}
    @Test
	public void testExisteNumerosOrdenados() {
		int[] numeros = {13,1,2,8,12,5};
		int[] resultado = {1,2,5,8,12,13};
		assertArrayEquals(resultado, numeros);
	}

}
