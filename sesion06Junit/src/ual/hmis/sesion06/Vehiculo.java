package ual.hmis.sesion06;

public class Vehiculo {	
	
	int pasajeros;
	int ruedas;
	double peso;
	
	public Vehiculo(int pasajeros, int ruedas, double peso) {
		this.pasajeros=pasajeros;
		this.ruedas=ruedas;
		this.peso=peso;
	}
	
	public double getPeso() {
		return peso;
	}
	
}
