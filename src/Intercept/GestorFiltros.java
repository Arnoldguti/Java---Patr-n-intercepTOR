package Intercept;

import java.io.IOException;
import java.net.URISyntaxException;

public class GestorFiltros {
//Crea la cadena Filtros y posee metodos para insertar los filtros en la cadena y
	//provocar que cada uno ejecute la petición del cliente y también el objetivo
	
	//Instanciamos un objeto de la cadena de filtros
	private CadenaFiltros cadenaFiltros;
	private Interfaz interfaz= new Interfaz();
	
	public GestorFiltros(Interfaz interfaz2)
	{
		//Inicializamos
		cadenaFiltros = new CadenaFiltros();		
	}
	
	//metodos
	public void setFiltro(Filtro filtro)	
	{
	cadenaFiltros.addFiltro(filtro);	
	}
	public void delFiltro(Filtro filtro)
	{
	cadenaFiltros.delFiltro(filtro);	
	}
	
	public void ejecutar(double pet) throws IOException, URISyntaxException
	{
		cadenaFiltros.ejecutar(pet);
	}


	
}
