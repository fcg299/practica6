package ual.hmis.sesion06;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;




class Ejercicio7Test {

	@ParameterizedTest (name = "{index} => Naciendo en ({0}) estas cursando {1}")
	@CsvSource({"2017, 1 Educacion Infantil",
				"2016, 2 Educacion Infantil",
				"2015, 3 Educacion Infantil",
				"2014, 1 Educacion Primaria",
				"2013, 2 Educacion Primaria",
				"2012, 3 Educacion Primaria",
				"2011, 4 Educacion Primaria",
				"2010, 5 Educacion Primaria",
				"2009, 6 Educacion Primaria",
				"2008, 1 Educacion Secundaria",
				"2007, 2 Educacion Secundaria",
				"2006, 3 Educacion Secundaria",
				"2005, 4 Educacion Secundaria",
				"2004, No esta en educacion obligatoria"})
	
	void testNotaAsignaturas(int input, String expected) {
		Alumno alu = new Alumno();
	
		assertEquals(expected, alu.cursoSegunEdad(input));
		// assertTrue(c.transformar(input)==expected);
	

		
	}

}
