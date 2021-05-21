package gerencialz.integracion1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PruebaTest {
	
	@Test
	public void sumaEnterosTest() {
		assertEquals("La suma ha dejado de ser correcta", 20, PruebaMain.suma(10, 10));
	}
	
	@Test
	public void sumaEnteros2Test() {
		assertEquals("La suma ha dejado de ser correcta", 150, PruebaMain.suma(10, 140));
	}
	
	@Test
	public void sumaEnteros3Test() {
		assertEquals("La suma ha dejado de ser correcta", 4, PruebaMain.suma(2, 2));
	}
	
	@Test
	public void sumaEnteros4Test() {
		assertEquals("La suma ha dejado de ser correcta", -1, PruebaMain.suma(0, 0));
	}
}
