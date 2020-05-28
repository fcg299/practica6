package ual.hmis.sesion06;

public class Ejercicio3 {
	public String asterisco(int x) {
		String resultado = "";
		
		if(x < 0) {
			resultado = "número erróneo";
		}else if (x <= 5){
			resultado = "*****";
		}else if (x>=12){
			resultado = "************";
		}else {
			
			for(int y=0; y<x; y++) {
				resultado= resultado + "*";
			}
		}
		
		return resultado;
	}

}
