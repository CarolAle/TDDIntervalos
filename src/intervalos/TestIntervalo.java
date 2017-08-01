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

}
