package ual.hmis.sesion06;

import java.util.ArrayList;
import java.util.*;

public class Alumno {

	private String nombre;
	private ArrayList<Actividad> actividadesAsignadas = new ArrayList<Actividad>();


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

	/**
	*@param nombre de actividad
	*@return el resultado de las notas
	*/
	public double calcularNotaActividad(String nombreActividad) {
		
		double resultado = 0;
		
		for (Actividad acti : actividadesAsignadas) {
			if (acti.getNombre().equals(nombreActividad)) {
				for (Ejercicio ejer : acti.getEjercicios()) {
					resultado = resultado + ejer.getPuntuacion();
				}
				acti.setPuntuacionTotal(resultado);
			}
		}
		
		return resultado;
	}
	
	/**
	*@param nota
	*@return string con tu nota
	*/
	public String calificacion(final double nota){
		if(nota < 0 || nota > 10) {
			return "Error en la nota";
		} else if (nota <= 4.9) {
			return "Suspenso";
		} else if (nota <= 6.9) {
			return "Aprobado";
		} else if (nota <= 8.9) {
			return "Notable";
		} else if (nota <= 9.9) {
			return "Sobresaliente";
		} else {
			return "Matricula";
		}
		
	}
	
	/**
	*@param fecha de nacimiento
	*@return string con el curso en el que estas
	*/
	public String cursoSegunEdad(final int nacimiento){
		
		switch(nacimiento) {
		case 2017:
			return "1 Educacion Infantil";
		case 2016:
			return "2 Educacion Infantil";
		case 2015:
			return "3 Educacion Infantil";
		case 2014:
			return "1 Educacion Primaria";
		case 2013:
			return "2 Educacion Primaria";
		case 2012:
			return "3 Educacion Primaria";
		case 2011:
			return "4 Educacion Primaria";
		case 2010:
			return "5 Educacion Primaria";
		case 2009:
			return "6 Educacion Primaria";
		case 2008:
			return "1 Educacion Secundaria";
		case 2007:
			return "2 Educacion Secundaria";
		case 2006:
			return "3 Educacion Secundaria";
		case 2005:
			return "4 Educacion Secundaria";
		}
		
		return "No esta en educacion obligatoria";
		
	}

}
