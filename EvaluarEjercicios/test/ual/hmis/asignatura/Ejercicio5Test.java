package ual.hmis.asignatura;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;




class Ejercicio5Test {

	@ParameterizedTest (name = "{index} => En una actividad con un ejercicio de nombre ({0}) y puntuacion {1} esperamos {2}")
	@CsvSource({"Matematicas, 5.0, 5.0",
				"No existo, 4.0, 0.0",
				"Existo sin ejercicios, 2.0, 0.0"})
	
	void testNotaAsignaturas(String Actividad, double notaEjer, double expected) {
	Actividad acti = new Actividad();
	acti.setNombre(Actividad);
	Ejercicio ejer = new Ejercicio();
	ejer.setNombre("Ejercicio 1");
	ejer.setPuntuacion(notaEjer);
	ArrayList<Ejercicio> ejercicios = new ArrayList<Ejercicio>();
	ejercicios.add(ejer);
	acti.setEjercicios(ejercicios);
	ArrayList<Actividad> actis = new ArrayList<Actividad>();
	actis.add(acti);
	Alumno alu = new Alumno();
	alu.setActividadesAsignadas(actis);
	
		assertEquals(expected, alu.calcularNotaActividad("Matematicas"));
		// assertTrue(c.transformar(input)==expected);
	
		
		//Esto esta escrito porque pensaba que habia que conseguir un 100% de coverage en todas las clases
		//Con lo bonito que es el verde del coverage completo, ya lo dejo por aqui
		alu.setNombre("ejemplo");
		assertEquals("ejemplo", alu.getNombre());
		
		assertEquals(Actividad, alu.getActividadesAsignadas().get(0).getNombre());
		
		assertEquals("Ejercicio 1", ejer.getNombre());
		
	}

}
