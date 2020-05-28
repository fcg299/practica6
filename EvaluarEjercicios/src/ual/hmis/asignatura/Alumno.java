package ual.hmis.asignatura;

import java.util.ArrayList;
import java.util.*;

public class Alumno {

	private String nombre;
	private ArrayList<Actividad> actividadesAsignadas;


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Actividad> getActividadesAsignadas() {
		return actividadesAsignadas;
	}

	public void setActividadesAsignadas(ArrayList<Actividad> actividadesAsignadas) {
		this.actividadesAsignadas = actividadesAsignadas;
	}

	public double calcularNotaActividad(String nombreActividad) {
		
		double resultado = 0;
		
		for(Actividad acti : actividadesAsignadas){
			if(acti.getNombre().equals(nombreActividad)) {
				for(Ejercicio ejer : acti.getEjercicios()) {
					resultado = resultado + ejer.getPuntuacion();
				}
				acti.setPuntuacionTotal(resultado);
			}
		}
		
		return resultado;
	}
	
	public String calificacion (double nota){
		
		if(nota < 0 || nota > 10) {
			return "Error en la nota";
		}else if(nota<= 4.9) {
			return "Suspenso";
		}else if(nota<= 6.9) {
			return "Aprobado";
		}else if(nota<= 8.9) {
			return "Notable";
		}else if(nota<= 9.9) {
			return "Sobresaliente";
		}else {
			return "Matricula";
		}
		
	}
	
	public String cursoSegunEdad(int nacimiento){
		
		switch(nacimiento) {
		case 2017:
			return "1º  Educación Infantil";
		case 2016:
			return "2º  Educación Infantil";
		case 2015:
			return "3º  Educación Infantil";
		case 2014:
			return "1º  Educación Primaria";
		case 2013:
			return "2º  Educación Primaria";
		case 2012:
			return "3º  Educación Primaria";
		case 2011:
			return "4º  Educación Primaria";
		case 2010:
			return "5º  Educación Primaria";
		case 2009:
			return "6º  Educación Primaria";
		case 2008:
			return "1º  Educación Secundaria";
		case 2007:
			return "2º  Educación Secundaria";
		case 2006:
			return "3º  Educación Secundaria";
		case 2005:
			return "4º  Educación Secundaria";
		}
		
		return "No esta en educacion obligatoria";
		
	}

}
