package ual.hmis.sesion06;

public class Ejercicio4 {
	public String comun(String puno, String pdos) {
		String resultado = "";
		
		for(int x=0; x<puno.length(); x++) {
			if(pdos.indexOf(puno.charAt(x)) != -1) {
				resultado = resultado + puno.charAt(x);
			}
		}
		return resultado;
	}

}
