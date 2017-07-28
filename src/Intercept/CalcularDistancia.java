package Intercept;
public class CalcularDistancia implements Filtro {
double rvolAnt, radio;
	


	CalcularDistancia(){
		rvolAnt  = 0;
		radio = 5;
	}
	
	
	public double ejecutar (Object o)
	{
		 Double d = null;
		 if (o instanceof Double) {
		        d = (Double) o;
		    }
		double revoluciones=d;
		double distancia=(revoluciones - rvolAnt) * 2 * radio *  3.1416;
		return distancia ;
		}

	
	
	
	
}
