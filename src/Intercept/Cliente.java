package Intercept;

import java.io.IOException;
import java.net.URISyntaxException;

//Una instancia cliente se encarga de enviar la peticion a la instancia objetivo//En este clase Interfaz

public class Cliente {

	private GestorFiltros gestorFiltros;
	
	//Constructorr para el gestor de filtros
	public Cliente()
	{
	this.gestorFiltros = new GestorFiltros(null);	
	}
	
	//Asignar los filtros y enviar la petición
	public void setGestorFiltros(GestorFiltros gestorFiltros)
	{
		this.gestorFiltros = gestorFiltros;
	}
	
	//Ejecucion
	public void enviarPeticion(double pet) throws IOException, URISyntaxException{
		gestorFiltros.ejecutar(pet);
	}
	
	
}
