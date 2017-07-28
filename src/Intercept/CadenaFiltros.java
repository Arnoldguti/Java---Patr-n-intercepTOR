package Intercept;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;

//Proporcionará varios filtros a la instancia GestorFiltros y se encargará de ejecutar
//los filtros siguiendo el orden en el que fueron introducidos

public class CadenaFiltros {
	private ArrayList<Filtro> filtros;// declarar : filtros es un ArrayList generico de elementos Filtro
	private Interfaz objetivo;
	
	
	CadenaFiltros()
	{
		filtros = new ArrayList<Filtro>();
		objetivo = new Interfaz();
	}
	
	public void addFiltro(Filtro filtro)
	{
	filtros.add(filtro);
	}
	
	
	public void delFiltro(Filtro filtro)
	{
	filtros.remove(filtro);	
	}
	
	
	public void ejecutar (double peticion) throws IOException, URISyntaxException
	{
	   for (Filtro filtro : filtros)
	   {
	      System.out.println("Nueva velocidad(m/s)" + filtro.ejecutar(peticion ) ) ;
	   }
	objetivo.ejecutar(peticion) ;
	}
	
	
	public void setObjetivo (Interfaz objetivo)
	{
	    this.objetivo = objetivo ;
	}
	
	
	
	
	
}
