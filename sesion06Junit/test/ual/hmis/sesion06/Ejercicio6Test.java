package ual.hmis.sesion06;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;




class Ejercicio6Test {

	@ParameterizedTest (name = "{index} => Con un ({0}) tu nota es {1}")
	@CsvSource({"0, Suspenso",
				"-1, Error en la nota",
				"14, Error en la nota",
				"3, Suspenso",
				"5, Aprobado",
				"7.5, Notable",
				"9.9, Sobresaliente",
				"10, Matricula"})
	
	void testNotaAsignaturas(double input, String expected) {
		Alumno alu = new Alumno();
	
		assertEquals(expected, alu.calificacion(input));
		// assertTrue(c.transformar(input)==expected);
	

		
	}

}
