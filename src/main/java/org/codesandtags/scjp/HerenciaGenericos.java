package org.codesandtags.scjp;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Ejemplo de Herencia con tipos Genericos y algunas colecciones Aqui se muestra
 * la magia de los comodines para el recorrido de colecciones
 * 
 * @author CodesandTags
 */
public class HerenciaGenericos {

	public static void main(String[] args) {
		// Aqui esta la prueba
		// Lista de nombres
		ArrayList<String> nombres = new ArrayList<String>();
		nombres.add("Clerigo");
		nombres.add("Phicar");
		nombres.add("Dmk");
		nombres.add("TalCosa");
		nombres.add("Urban");
		nombres.add("Radical");

		// Imprimiento
		System.out.println(" [ Nombres ] ");
		imprime(nombres);

		// Lista de numeros
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(12);
		numeros.add(6);
		numeros.add(66);
		numeros.add(888);
		numeros.add(777);

		// Imprimiendo
		System.out.println("\n [ Numeros ] ");
		imprime(numeros);

		// Ahora los HashTables
		Hashtable<String, String> empleados = new Hashtable<String, String>();
		empleados.put("1111", "Programador");
		empleados.put("9999", "Tester");
		empleados.put("3333", "Director Proyecto");
		empleados.put("5555", "Gerente Tecnologia");
		empleados.put("6666", "Analista Requerimientos");

		System.out.println("\n [ Empleados ] ");
		imprime(empleados);
	}

	/**
	 * Metodo que se encarga de imprimir una lista de objetos sin importar el
	 * tipo de datos almacenados
	 * 
	 * @param objetos
	 */
	public static void imprime(ArrayList<?> objetos) {
		for (Object o : objetos) {
			System.out.println("=> " + o);
		}
	}

	/**
	 * Metodo sobrecargado de imprimir pero utilizando un HashTable
	 * 
	 * @param objetos
	 */
	public static void imprime(Hashtable<?, ?> objetos) {
		Enumeration<?> keys = objetos.keys();
		while (keys.hasMoreElements()) {
			System.out.println("=> " + objetos.get(keys.nextElement()));
		}
	}

}
