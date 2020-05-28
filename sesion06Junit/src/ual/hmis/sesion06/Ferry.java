package ual.hmis.sesion06;

import java.util.ArrayList;

public class Ferry extends Vehiculo{

	

	int pasajerosMax;
	double pesoMaxVehiculos;
	int maxVehiculos;
	double pesoVehiculos;
	ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
	
	public Ferry(int pasajeros, double pesoCarga,int pasajerosMax, 
			int pesoMaxVehiculos, int maxVehiculos) {
		super(pasajeros, 0, pesoCarga);
		this.pasajerosMax = pasajerosMax;
		this.pesoMaxVehiculos = pesoMaxVehiculos;
		this.maxVehiculos = maxVehiculos;
	}
	
	public ArrayList<Vehiculo> getVehiculos() {
		return vehiculos;
	}
	
		// Embarca un vehículo añadiéndolo a la lista    
		boolean embarcarVehiculo(Vehiculo v){
			boolean added = this.getVehiculos().add(v);

			if (this.superadoMaximoPeso() || this.superadoMaximoVehiculos()) {
				this.getVehiculos().remove(v);
				return false;
			}

			return added;
		}
		
		// devuelve el número total de vehículos embarcados     
		int totalVehiculos(){
			return vehiculos.size();
		}
		
		// verdadero si no hay ningún vehículo   
		boolean vacio(){
			return vehiculos.size()==0;
		}
		
		// verdadero si el número total de los vehículos supera el máximo    
		boolean superadoMaximoVehiculos(){
			return vehiculos.size()>maxVehiculos;
		}
		
		// verdadero si el peso total de los vehículos supera el máximo
		boolean superadoMaximoPeso(){
			double pesoActual=0.0;
			for(Vehiculo vehi: vehiculos) {
				pesoActual = pesoActual + vehi.getPeso();
			}
			return pesoActual>pesoMaxVehiculos;
		}
}
