
package oop.gestorusuarios;

import java.io.FileNotFoundException;

/**
 * @author Eñaut Agirre
 *
 */
public class Main {
	/**
	 * el programa principal que lanza la aplicación
	 * un cambio en github
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		GestorUsuariosApp gua = new GestorUsuariosApp();
		gua.run();
	}

}
