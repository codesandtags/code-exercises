package org.codesandtags.ejercicios;

/**
 * Desarrollar un algoritmo que imprima las tablas de multiplicar de un numero
 * dado.
 * 
 * @author codesandtags
 * 
 */
public class TablasMultiplicar {
	public static void main(String[] args) {

		// Instancia a la clase
		TablasMultiplicar resultado = new TablasMultiplicar();

		// Ejemplo para imprimir las tablas de multiplicar
		resultado.mostrarTablasMultiplicar(9, 10);

		// Imprimiendo las tablas del 15 al 20, mostrando los primeros 12 numeros
		for (int tabla = 15; tabla <= 20; tabla++) {
			resultado.mostrarTablasMultiplicar(tabla, 12);
		}

	}

	public void mostrarTablasMultiplicar(int numero, int cuantas) {

		System.out.println("\nImprimiento tablas del numero [" + numero	+ "]\n");
		for (int i = 1; i <= cuantas; i++) {
			System.out.println(numero + " x " + i + " = " + (numero * i));
		}

	}

}
