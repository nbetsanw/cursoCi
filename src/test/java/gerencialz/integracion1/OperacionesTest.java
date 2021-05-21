package gerencialz.integracion1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;


public class OperacionesTest {
	@Test
	public void operacionesMultiplicacionTest() {
		assertEquals("La multiplicacion ha dejado de ser correcta", 10, Operaciones.multiplicacion(2, 5));
	}
	
	@Test
	public void operacionesRestaTest() {
		assertEquals("La resta ha dejado de ser correcta", 110, Operaciones.resta(140, 30));
	}
	
	@Test
	public void operacionesDivisionTest() {
		assertEquals("La division ha dejado de ser correcta", 4, Operaciones.division(8, 2));
		//assertThrows(ArithmeticException.class,Operaciones.division(8, 0));
		//assertThrows("Error de division por 0", Exception.class, () -> Operaciones.division(8, 0));
		
	}
	
	
	@Test
	public void operacionesDivisionPorCeroTest() {
		assertEquals("La division ha dejado de ser correcta", 0, Operaciones.division(8, 0));
	}
}
