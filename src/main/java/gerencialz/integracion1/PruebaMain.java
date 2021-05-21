package gerencialz.integracion1;

import java.util.logging.Logger;
import java.util.logging.Level;

public class PruebaMain {

	public static final Logger logger = Logger.getLogger("gerencialz.app");
	
	public static int suma(int numero1, int numero2) {
		if(numero1 == 0 && numero2 == 0)
			return -1;
		return numero1 + numero2;
	}
	
	public Integer suma2(Integer numero1, Integer numero2)
	{
		numero2 = null;
		return numero1.intValue() + numero2.intValue();
	}
	
	public static void main(String[] args) {
		logger.log(Level.INFO, "Hola mundo");
		logger.log(Level.INFO, "El resultado de la suma es: {0}",  suma(2,4));
	}

}
