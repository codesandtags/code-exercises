package org.codesandtags.ejercicios;

/**
 * Desarrollar un algoritmo que imprima las 10 primeras potencias de un número
 * dado
 * 
 * @author codesandtags
 * 
 */
public class PotenciasNumero {
	public static void main(String[] args) {

		// Instancia de la clase
		PotenciasNumero resultado = new PotenciasNumero();

		// Ejemplo para el numero 3 y 10 potencias
		resultado.imprimirPotencias(3, 10);

		// Ejemplo con varios numeros
		for (int numero = 7; numero < 15; numero++) {
			resultado.imprimirPotencias(numero, 5);
		}

	}

	/**
	 * Imprime la cantidad de potencias especificadas para un numero dado
	 * 
	 * @param numero
	 *            : El numero a operar // * @param potencias : La cantidad de
	 *            potencias a procesar
	 */
	public void imprimirPotencias(int numero, int potencias) {
		System.out.println("\nImprimiendo potencias del numero [" + numero
				+ "]\n");
		long n = numero;
		for (int i = 1; i <= potencias; i++) {
			System.out.println("Numero " + numero + " ^ " + i + " = " + n);
			n *= numero;
		}

	}
}
