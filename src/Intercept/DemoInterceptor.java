package Intercept;

import java.io.IOException;
import java.net.URISyntaxException;

public class DemoInterceptor {

	
	public static void main(String[] args) throws IOException, URISyntaxException{
  
		GestorFiltros gestorFiltros = new GestorFiltros(new Interfaz());
		gestorFiltros.setFiltro(new Calcular());		
        Cliente cliente = new Cliente();
        cliente.setGestorFiltros(gestorFiltros);
        cliente.enviarPeticion(300);// Vueltas Iniciales
		
	}
	
}
