package intervalos;
import static org.junit.Assert.*;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestIntervalo {

	@Test
	public void testTipoInt() {
		int[] numeros = {1, 2, 3};
		boolean intervalo = new Intervalos().intervalo(numeros);
		assertEquals(true, intervalo);
	}

}
