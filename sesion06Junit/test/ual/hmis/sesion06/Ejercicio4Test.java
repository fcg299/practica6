package ual.hmis.sesion06;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;




class Ejercicio4Test {

	@ParameterizedTest (name = "{index} => La salida comun entre {0} y {1} es {2}")
	@CsvSource({"uno, uno, uno",
				"pato, palmera, pa",
				"sirope, coral, ro",
				"pato, pastel, pat",})
	
	void testTransformar(String uno,String dos, String expected) {
	Ejercicio4 c = new Ejercicio4();
		assertEquals(expected, c.comun(uno,dos));
		// assertTrue(c.transformar(input)==expected);
	
	}

}
