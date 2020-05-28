package ual.hmis.sesion06;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;




class Ejercicio8Test {

	@ParameterizedTest (name = "{index} => Hay {0} coches de {1} kg para cargar, "
			+ "¿Cuantos se han cargado? {2}, "
			+ "¿Bodega vacia? {3}, "
			+ "¿Caben todos? {4}"
			+ "¿Demasiado peso? {5}")
	
	@CsvSource({"5, 500,  5, false, false, false",
				"4, 1001,  4, false, false, true",
				"9, 500, 9, false, true, true",
				"0, 500, 0, true, false, false"})
	
	void testTransformar(int vCargables,double pesoUnidad,
			int cargadosEsperados, boolean bodegaVacia, boolean cabenPorNumero, boolean cabenPeso){
		//El ferry puede llevar como maximo 4000 kilos y 8 coches
		Ferry ferry = new Ferry(600, 4000, 650, 4000, 8);
		//Los coches que vamos a meter X veces en el ferry
		Vehiculo vehi = new Vehiculo(5,4,pesoUnidad);
		
		//Empezamos comprobando el proceso de carga con un ferry de practica
		Ferry ferryDePracticas = new Ferry(600, 4000, 650, 4000, 8);
		Vehiculo mastodonte = new Vehiculo(5,4,50000);
		assertFalse(ferryDePracticas.embarcarVehiculo(mastodonte));
		Vehiculo mini = new Vehiculo(5,4,20);
		assertTrue(ferryDePracticas.embarcarVehiculo(mini));
		assertTrue(ferryDePracticas.embarcarVehiculo(mini));
		assertTrue(ferryDePracticas.embarcarVehiculo(mini));
		assertTrue(ferryDePracticas.embarcarVehiculo(mini));
		assertTrue(ferryDePracticas.embarcarVehiculo(mini));
		assertTrue(ferryDePracticas.embarcarVehiculo(mini));
		assertTrue(ferryDePracticas.embarcarVehiculo(mini));
		assertTrue(ferryDePracticas.embarcarVehiculo(mini));
		assertFalse(ferryDePracticas.embarcarVehiculo(mini));

		

		//Antes de cargar comprobamos que puede cargar peso
		assertFalse(ferry.superadoMaximoVehiculos());
		
		//Carga de vehiculos
		for(int x=0; x<vCargables;x++) {
			ferry.getVehiculos().add(vehi);
		}
		//Comprobamos si esta vacio
		assertEquals(bodegaVacia, ferry.vacio());
		
		//Total vehiculos
		assertEquals(cargadosEsperados, ferry.totalVehiculos());
		
		
		assertEquals(cabenPeso, ferry.superadoMaximoPeso());
		assertEquals(cabenPorNumero, ferry.superadoMaximoVehiculos());
		


	}

}
