package ual.hmis.asignatura;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;




class Ejercicio7Test {

	@ParameterizedTest (name = "{index} => Naciendo en ({0}) estas cursando {1}")
	@CsvSource({"2017, 1º  Educación Infantil",
				"2016, 2º  Educación Infantil",
				"2015, 3º  Educación Infantil",
				"2014, 1º  Educación Primaria",
				"2013, 2º  Educación Primaria",
				"2012, 3º  Educación Primaria",
				"2011, 4º  Educación Primaria",
				"2010, 5º  Educación Primaria",
				"2009, 6º  Educación Primaria",
				"2008, 1º  Educación Secundaria",
				"2007, 2º  Educación Secundaria",
				"2006, 3º  Educación Secundaria",
				"2005, 4º  Educación Secundaria",
				"2004, No esta en educacion obligatoria"})
	
	void testNotaAsignaturas(int input, String expected) {
		Alumno alu = new Alumno();
	
		assertEquals(expected, alu.cursoSegunEdad(input));
		// assertTrue(c.transformar(input)==expected);
	

		
	}

}
