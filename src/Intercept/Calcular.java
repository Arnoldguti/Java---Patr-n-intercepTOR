package Intercept;

public class Calcular implements Filtro {
 double intervalo;
 double revoluciones = 100;
 double revolAnt;
	
 
 Calcular()
 {
	 intervalo = 10;
	 revolAnt= 0;
	 
 }

	
	public double ejecutar(Object o) {
		 Double d = null;
		    if (o instanceof Double) {
		        d = (Double) o;
		    }
		
		double distancia= d;
		double velocidad=distancia * 3600 / intervalo;
		//revolAnt = revoluciones;
		return velocidad;
		}
	
	

}
