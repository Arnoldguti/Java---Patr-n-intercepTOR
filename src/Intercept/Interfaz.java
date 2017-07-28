package Intercept;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Interfaz {
//Se trata de un objeto /(Que representa una aplicacion ya instalada en el marco)
	//de trabajo) Se encarga de procesar la informacion que se envia desde el cliente
	//
	
	public void ejecutar (double value) throws IOException, URISyntaxException {
		 String url = "http://localhost:8090/JSFCar/faces/index.xhtml";

	        if (Desktop.isDesktopSupported()) {
	            // Windows
	            Desktop.getDesktop().browse(new URI(url));
	        } else {
	            // Ubuntu
	            Runtime runtime = Runtime.getRuntime();
	            runtime.exec("/usr/bin/firefox -new-window " + url);
	        }
	
	}
	
	
}
