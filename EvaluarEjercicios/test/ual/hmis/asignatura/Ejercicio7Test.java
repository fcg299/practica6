package ual.hmis.asignatura;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;




class Ejercicio7Test {

	@ParameterizedTest (name = "{index} => Naciendo en ({0}) estas cursando {1}")
	@CsvSource({"2017, 1�� Educaci�n�Infantil",
				"2016, 2�� Educaci�n�Infantil",
				"2015, 3�� Educaci�n�Infantil",
				"2014, 1�� Educaci�n�Primaria",
				"2013, 2�� Educaci�n�Primaria",
				"2012, 3�� Educaci�n�Primaria",
				"2011, 4�� Educaci�n�Primaria",
				"2010, 5�� Educaci�n�Primaria",
				"2009, 6�� Educaci�n�Primaria",
				"2008, 1�� Educaci�n�Secundaria",
				"2007, 2�� Educaci�n�Secundaria",
				"2006, 3�� Educaci�n�Secundaria",
				"2005, 4�� Educaci�n�Secundaria",
				"2004, No esta en educacion obligatoria"})
	
	void testNotaAsignaturas(int input, String expected) {
		Alumno alu = new Alumno();
	
		assertEquals(expected, alu.cursoSegunEdad(input));
		// assertTrue(c.transformar(input)==expected);
	

		
	}

}
