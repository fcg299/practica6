package ual.hmis.sesion06;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;



class Ejercicio3Test {

	@ParameterizedTest (name = "{index} => Con entrada ({0}) sale {1}")
	@CsvSource({"-5, número erróneo",
				"2, *****",
				"6, ******",
				"15, ************",
				"5, *****",
				"12, ************"})
	
	void testTransformar(int input, String expected) {
	Ejercicio3 c = new Ejercicio3();
		assertEquals(expected, c.asterisco(input));
		// assertTrue(c.transformar(input)==expected);
	
	}

}
